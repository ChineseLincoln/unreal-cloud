package org.unreal.cloud.jwt

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.SignatureException
import org.joda.time.DateTime

object JwtTokenUtils {

    private val expirationTime = 3600

    fun getToken(tokenInfo: TokenInfo) : String{
        return Jwts.builder()
                //设置用户名
                .setSubject(tokenInfo.userName)
                //设置用户Id
                .setId(tokenInfo.id)
                //设置用户权限
                .setAudience(tokenInfo.role)
                //设置过期时间
                .setExpiration(DateTime.now().plusSeconds(expirationTime).toDate())
                //设置颁发时间
                .setIssuedAt(DateTime.now().toDate())
                //设置用户账号
                .claim("account",tokenInfo.account)
                .signWith(SignatureAlgorithm.RS256 , KeyHelper.getPrivateKey(JwtTokenUtils::class.java.getResource("/pri.key").path))
                .compact()
    }

    fun parseToken(compactJws:String):TokenInfo{
        try {
            val parseClaimsJws = Jwts.parser().setSigningKey( KeyHelper.getPublicKey(JwtTokenUtils::class.java.getResource("/pub.key").path)).parseClaimsJws(compactJws)
            val body = parseClaimsJws.body
            return TokenInfo(body.id, body["account"].toString(),body.audience,body.subject)
        }catch (e :SignatureException){
            throw e
        }

    }
}