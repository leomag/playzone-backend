package ru.isaev.features.cache

import ru.isaev.features.register.RegisterReceiveRemote

/**
 * Created by i.isaev on 08.06.2022.
 */

data class TokenCache(
    val login: String,
    val token: String
)

object InMemoryCache {
    var userList: MutableList<RegisterReceiveRemote> = mutableListOf()
    var token: MutableList<TokenCache> = mutableListOf()
}
