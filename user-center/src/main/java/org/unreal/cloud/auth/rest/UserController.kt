package org.unreal.cloud.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.domain.Page
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.unreal.cloud.model.BaseUserEntity
import org.unreal.cloud.service.BaseUserService

@RestController
@RequestMapping("users")
class UserController{

    @Value("\${foo:hello}")
    lateinit var foo:String

    @Autowired
    lateinit var userService : BaseUserService

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id:String):String{
        return "get foo message is -->${foo}, path id is -->$id"
    }

    @GetMapping
    fun getUsers(): ResponseEntity<Page<BaseUserEntity>>? {
        return ResponseEntity.status(50010).body(userService.allUser)
    }

}