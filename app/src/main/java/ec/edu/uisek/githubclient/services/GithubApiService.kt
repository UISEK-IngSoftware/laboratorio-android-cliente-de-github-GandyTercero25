package ec.edu.uisek.githubclient.services
import retrofit2.http.GET
import ec.edu.uisek.githubclient.models.Repo
import retrofit2.Call


interface GithubApiService {
    @GET(value = "user/repos")
    fun getRepos() : Call<List<Repo>>
}