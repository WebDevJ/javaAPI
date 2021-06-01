package com.webdevj.kotlinApi.service

import com.webdevj.kotlinApi.datasource.UserDataSource
import com.webdevj.kotlinApi.model.User
import org.springframework.stereotype.Service

@Service // available at run time can be injected into other objects and classes
class UserService(private val dataSource: UserDataSource) {
    fun getUsers(): Collection<User> {
        return dataSource.retrieveUsers()
    }
}