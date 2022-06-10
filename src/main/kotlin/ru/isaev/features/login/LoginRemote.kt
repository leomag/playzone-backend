package ru.isaev.features.login

import kotlinx.serialization.Serializable

/**
 * Created by i.isaev on 08.06.2022.
 */
@Serializable
data class LoginReceiveRemote(
    val login: String,
    val password: String
)

@Serializable
data class LoginResponseRemote(
    val token: String
)
