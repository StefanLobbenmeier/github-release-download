import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*


class GithubReleaseDownloader(url: String) {
    suspend fun downloadRelease() {
        val httpClient = HttpClient()
        val response: HttpResponse = httpClient.get("https://www.example.com")

        print(response.body<String>())
    }
}