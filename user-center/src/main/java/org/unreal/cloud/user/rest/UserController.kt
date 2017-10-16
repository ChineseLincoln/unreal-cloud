package org.unreal.cloud.user.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.domain.Page
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.unreal.cloud.common.exception.auth.TokenErrorException
import org.unreal.cloud.common.vo.BaseResponse
import org.unreal.cloud.user.model.BaseUserEntity
import org.unreal.cloud.user.service.BaseUserService

@RestController
@RequestMapping("users",produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
class UserController{

    @Value("\${foo:hello}")
    lateinit var foo:String

    @Autowired
    private lateinit var userService : BaseUserService

    @GetMapping("/{id}")
    fun getUserById(@RequestHeader("access-token") accessToken : String, @PathVariable id:String):String{
        throw TokenErrorException()
        return "get foo message is -->${foo}, path id is -->$id , access token is --->$accessToken"
    }

    @GetMapping
    fun getUsers(): BaseResponse<Page<BaseUserEntity>> {
        val data = userService.allUser
        return BaseResponse(data)
    }

}