package org.unreal.cloud.auth.interceptor

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.unreal.cloud.auth.scheduler.clientTokenSchduler
import org.unreal.cloud.auth.service.RouterCenterService
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.jwt.TokenInfo

/**
 * 在发送fegin 请求时增加 client-token 标志
 */
//class FeignClientRequestInterceptor : RequestInterceptor{
//
//
//
//    override fun apply(template: RequestTemplate?) {
//        template?.header("client-token" , clientTokenSchduler.token)
//    }
//
//}
