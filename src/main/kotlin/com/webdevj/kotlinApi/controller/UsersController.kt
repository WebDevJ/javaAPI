package com.webdevj.kotlinApi.controller

import com.webdevj.kotlinApi.model.User
import com.webdevj.kotlinApi.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController //initializing class to hand rest request
@RequestMapping("/api/users")  // base url for rest endpoints in this class; http://localhost:8080/api/users
class UsersController(private val service: UserService) { // getUsers using service
    @GetMapping
    //fun users(): String = "users REST end point!" //breaking my progress into branch sections on github;  1_setup
    fun getUsers(): Collection<User> = service.getUsers()
}