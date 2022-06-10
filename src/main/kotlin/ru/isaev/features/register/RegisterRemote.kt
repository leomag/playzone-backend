package ru.isaev.features.register

import kotlinx.serialization.Serializable

/**
 * Created by i.isaev on 08.06.2022.
 */
@Serializable
data class RegisterReceiveRemote(
    val login: String,
    val email: String,
    val password: String
)

@Serializable
data class RegisterResponseRemote(
    val token: String
)
