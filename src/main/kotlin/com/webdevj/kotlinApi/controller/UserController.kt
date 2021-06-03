package com.webdevj.kotlinApi.controller

import com.webdevj.kotlinApi.model.User
import com.webdevj.kotlinApi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
@RestController //initializing class to hand rest request
@RequestMapping("/api/user")  // base url for rest endpoints in this class; http://localhost:8080/api/users
class UserController(private val service: UserService) { // getUsers using service
    @crossorigin(origins = "*", allowedheaders = "*")

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int): User = service.getUser(id)

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> =
            ResponseEntity(e.message, HttpStatus.NOT_FOUND)
}


