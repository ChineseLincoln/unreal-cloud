package org.unreal.cloud.auth.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.unreal.cloud.common.exception.auth.TokenErrorException
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.jwt.TokenInfo

@RestController
@RequestMapping("/jwt")
class AuthenticationController {

    @PostMapping
    fun authentication(account:String , password :String): ResponseEntity<*>{
        return if(account == "lincoln" && password == "123123"){
            ResponseEntity.ok(JwtTokenUtils.getToken(TokenInfo("1",account,"admin","林肯")))
        }else{
            throw TokenErrorException()
        }
    }
}