package fr.epf.min1.speedycart.models

import java.util.Date

data class Client(
    val firstname: String? = null,
    val lastname: String? = null,
    val active_from: Date? = null,
    val deactive_from: Date? = null,
    val client_DOB: Date? = null
)
