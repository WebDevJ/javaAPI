package com.webdevj.kotlinApi.datasource.mock

import com.webdevj.kotlinApi.datasource.UserDataSource
import com.webdevj.kotlinApi.model.User
import org.springframework.stereotype.Repository

// mocking data instead of using a data base for now
@Repository //springBoot Bean
class MockUserDataSource : UserDataSource { //using UserDataSource and getUsers method
    override fun retrieveUsers(): Collection<User> {
        return listOf(
                User(1,"John Doe"),
                User(2,"Mary Jane")
        )
    }
}