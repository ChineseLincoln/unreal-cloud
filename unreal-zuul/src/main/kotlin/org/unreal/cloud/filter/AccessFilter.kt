package org.unreal.cloud.filter

import com.google.gson.Gson
import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.unreal.cloud.jwt.JwtTokenUtils
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants


@Component
class AccessFilter : ZuulFilter(){

    private val logger = LoggerFactory.getLogger(AccessFilter::class.java)

    override fun filterType(): String {
        return FilterConstants.PRE_TYPE
    }

    override fun filterOrder(): Int {
        return 0
    }

    override fun shouldFilter(): Boolean {
        return true
    }

    override fun run(): Any? {
        val ctx = RequestContext.getCurrentContext()
        val request = ctx.request
        if(request.requestURI.contains("/auth/jwt")){
            return null
        }
        val token = request.getHeader("access-token")
        //校验token
        if (token == null) {
            sendAuthError(ctx)
        } else {
            try {
                val parseToken = JwtTokenUtils.parseToken(token)
            }catch (e:Exception){
                sendAuthError(ctx)
            }
        }
        return null
    }

    private fun sendAuthError(ctx: RequestContext) {
        ctx.setSendZuulResponse(false)
        ctx.addZuulResponseHeader("content-type", "application/json;charset=utf-8")
        ctx.response.status = 200
        ctx.responseBody = "{\"status\":401,\"message\":\"认证失败！\"}"
    }

}