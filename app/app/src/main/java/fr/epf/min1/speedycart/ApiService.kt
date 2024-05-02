package fr.epf.min1.speedycart

import fr.epf.min1.speedycart.models.Client
import retrofit2.Response
import retrofit2.http.*
import java.nio.file.attribute.UserPrincipal

interface ApiService {

    @GET("Clients/1")
    suspend fun getClient(): Response<Client>
}