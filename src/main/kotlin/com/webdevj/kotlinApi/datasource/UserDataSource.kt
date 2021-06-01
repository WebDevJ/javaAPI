package com.webdevj.kotlinApi.datasource

import com.webdevj.kotlinApi.model.User

// defines functionality for data source
interface UserDataSource {
    // return collection of user entities
    fun retrieveUsers(): Collection<User>
    fun retrieveUser(id: Int): User
}