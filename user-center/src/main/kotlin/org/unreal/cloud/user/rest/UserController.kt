package org.unreal.cloud.user.rest

import org.apache.commons.codec.digest.DigestUtils
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.unreal.cloud.common.vo.BaseResponse
import org.unreal.cloud.user.exception.UserAccountAlreadyUsedException
import org.unreal.cloud.user.exception.UserAccountOrPasswordEmptyException
import org.unreal.cloud.user.model.BaseUserEntity
import org.unreal.cloud.user.service.IBaseUserService
import org.unreal.cloud.user.service.impl.BaseUserService

@RestController
@RequestMapping("users",produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
class UserController{

    @Autowired
    private lateinit var userService : IBaseUserService

    @GetMapping("/login")
    fun login(account : String , password:String) : BaseResponse<BaseUserEntity> {
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(password)){
            throw UserAccountOrPasswordEmptyException()
        }
        return BaseResponse.ok(userService.login(account , DigestUtils.md5Hex(password) ?: ""))
    }

    @PostMapping("/register")
    fun register(account : String , password: String): BaseResponse<String> {
        if(StringUtils.isEmpty(account) || StringUtils.isEmpty(password)){
            throw UserAccountOrPasswordEmptyException()
        }
        if(userService.accountAlreadyUsed(account)){
            throw UserAccountAlreadyUsedException()
        }
        userService.register(account , DigestUtils.md5Hex(password) ?: "")
        return BaseResponse.ok()
    }

}