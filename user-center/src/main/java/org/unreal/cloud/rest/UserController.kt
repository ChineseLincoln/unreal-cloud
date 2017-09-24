package org.unreal.cloud.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("user")
class UserController{

    @Value("\${foo:hello}")
    lateinit var foo:String

    @RequestMapping("/{id}")
    fun getUserById(@PathVariable id:String):String{
        return "get foo message is -->${foo}, path id is -->$id"
    }
}