package com.webdevj.kotlinApi.datasource.mock

import com.webdevj.kotlinApi.datasource.UserDataSource
import com.webdevj.kotlinApi.model.User
import org.springframework.stereotype.Repository

// mocking data instead of using a data base for now
@Repository //springBoot Bean
class MockUserDataSource : UserDataSource { //using UserDataSource and getUsers method
    val users = listOf(
    User(1,"John Doe"),
    User(2,"Mary Jane")
    )

    override fun retrieveUsers(): Collection<User> = users

    override fun retrieveUser(studentid: Int): User {
        return users.first{it.studentid == studentid}
    }
}