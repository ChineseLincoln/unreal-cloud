package org.unreal.cloud.jwt

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.SignatureException
import org.joda.time.DateTime
import org.slf4j.LoggerFactory

object JwtTokenUtils {

    val logger  = LoggerFactory.getLogger(JwtTokenUtils::class.java)

    val key = ""
    val expirationTime = 3600

    fun getToken(userId: String, account: String, username: String, role: String) : String{
        return Jwts.builder()
                .setSubject(username)
                .setId(userId)
                .claim("role" ,role)
                .setIssuer(account)
                .setExpiration(DateTime.now().plusSeconds(expirationTime).toDate())
                .signWith(SignatureAlgorithm.RS256 , key)
                .compact()
    }

    fun parseToken(compactJws:String):Boolean{
        var isSuccess = false
        try {
            Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws)
            isSuccess = true
            //OK, we can trust this JWT
        } catch (e: SignatureException) {
            logger.error("Json web Token 校验失败!",e.message)
        }
        return isSuccess
    }
}