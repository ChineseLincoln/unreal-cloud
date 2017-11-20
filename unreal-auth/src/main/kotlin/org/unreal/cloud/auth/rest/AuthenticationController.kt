package org.unreal.cloud.auth.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.unreal.cloud.auth.service.UserCenterService
import org.unreal.cloud.common.vo.BaseResponse
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.jwt.TokenInfo

@RestController
@RequestMapping(value = "/jwt", produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
open class AuthenticationController {

    @Autowired
    private lateinit var userCenterService: UserCenterService

    @PostMapping("/users")
    open fun authenticationUser(account: String, password: String): BaseResponse<String> {
        val userResponse = userCenterService.login(account, password)
        val user = userResponse.data
        val tokenInfo = TokenInfo(user.id.toString(), user.account, "", user.name ?: "游客${user.id}")
        val token = JwtTokenUtils.getToken(tokenInfo)
        return BaseResponse.ok(token)
    }

}