import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlin.test.Test

@OptIn(ExperimentalCoroutinesApi::class)
class GithubReleaseDownloaderTest {
    @Test
    fun downloadRelease() = runTest {
        GithubReleaseDownloader("").downloadRelease()
    }
}