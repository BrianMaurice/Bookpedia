package com.brayomauri.bookpedia.book.data.network
import com.brayomauri.bookpedia.book.data.dto.SearchResponseDto
import com.brayomauri.bookpedia.core.domain.DataError
import com.brayomauri.bookpedia.core.domain.Result
import com.brayomauri.bookpedia.core.domain.data.safeCall
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter

private const val BASE_URL = "https://openlibrary.org"

class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
): RemoteBookDataSource {
    override suspend fun searchBooks(
        query: String,
        resultLimit: Int?
    ): Result<SearchResponseDto, DataError.Remote>{
        return safeCall {
            httpClient.get(
                urlString = "$BASE_URL/search.json"
            ) {
                parameter("q", query)
                parameter("limit", resultLimit)
                parameter("language", "eng")
                parameter("fields","key,title,language,cover_i,author_key,author_name,cover_edition_key,ratings_average, ratings_count,first_publish_year,number_of_pages_median,edition_count")
            }
        }
    }
}