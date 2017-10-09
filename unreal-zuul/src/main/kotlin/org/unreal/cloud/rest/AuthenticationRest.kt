package org.unreal.cloud.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.jwt.TokenInfo

@RestController
@RequestMapping("/auth")
class AuthenticationRest{

    @PostMapping
    fun authentication(account:String , password :String): ResponseEntity<String>{
        return if(account == "lincoln" && password == "123123"){
            ResponseEntity.ok(JwtTokenUtils.getToken(TokenInfo("1",account,"admin","林肯")))
        }else{
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()
        }
    }
}