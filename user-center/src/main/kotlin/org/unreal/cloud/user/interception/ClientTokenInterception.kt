package org.unreal.cloud.user.interception

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import org.unreal.cloud.common.exception.auth.ClientNotAllowException
import org.unreal.cloud.jwt.JwtTokenUtils
import org.unreal.cloud.user.service.RouterCenterService
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * 用来过滤客户端是否在服务列表中
 */
//@Component
//open class ClientTokenInterception : HandlerInterceptor{
//
//    @Value("\${client.id}")
//    private var id : String = ""
//
//    @Value("\${client.secret}")
//    private var secret : String = ""
//
//    @Autowired
//    private lateinit var routerCenterService : RouterCenterService
//
//    override fun afterCompletion(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, ex: Exception?) {
//    }
//
//    override fun postHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, modelAndView: ModelAndView?) {
//    }
//
//    override fun preHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?): Boolean {
//        val clientToken = request?.getHeader("client-token")
//        val parseToken = JwtTokenUtils.parseToken(clientToken?:"")
//        val allowedRouterClient = routerCenterService.getAllowedRouterClient(id.toLong() , secret)
//        if(allowedRouterClient.status == 200){
//            val data = allowedRouterClient.data
//            var isAllow = false
//            data.forEach{
//                if(it == parseToken.role){
//                    isAllow = true
//                }
//            }
//            if(isAllow){
//                return true
//            }else{
//                throw ClientNotAllowException()
//            }
//        }else{
//            throw ClientNotAllowException()
//        }
//
//
//    }
//
//}