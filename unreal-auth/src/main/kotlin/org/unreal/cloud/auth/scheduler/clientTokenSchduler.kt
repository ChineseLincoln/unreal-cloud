package org.unreal.cloud.auth.scheduler

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.unreal.cloud.auth.service.RouterCenterService
import org.unreal.cloud.common.feign.RouterClientFeignDto
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.jwt.TokenInfo

/**
 * 定时获取Client Token
 */
@Component
class clientTokenSchduler{
//
//    @Value("\${client.id}")
//    private var clientId : String = ""
//
//    @Value("\${client.secret}")
//    private var secret : String = ""
//
//    @Autowired
//    private lateinit var  routerCenterService : RouterCenterService
//
//    @Scheduled(cron = "0/30 * * * * ?")
//    fun getClientToken(){
//        val routerResponse = routerCenterService.getRouterClient(clientId.toLong() ,secret)
//        if(routerResponse.status == 200) {
//            val router: RouterClientFeignDto = routerResponse.data
//            val tokenInfo = TokenInfo(router.id.toString(), router.secret, router.code, router.name ?: "client - ${router.id}")
//            token = JwtTokenUtils.getToken(tokenInfo)
//        }
//    }
//
//    companion object {
//        var token : String = ""
//    }
}