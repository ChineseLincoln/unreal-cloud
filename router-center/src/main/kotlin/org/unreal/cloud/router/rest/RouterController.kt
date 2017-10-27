package org.unreal.cloud.router.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.unreal.cloud.common.vo.BaseResponse
import org.unreal.cloud.router.exception.RouterClientLocked
import org.unreal.cloud.router.exception.RouterClientNotFound
import org.unreal.cloud.router.exception.RouterSecretError
import org.unreal.cloud.router.model.RouterClientEntity
import org.unreal.cloud.router.service.IRouterService

@RestController
@RequestMapping(value = "routers" , produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
class RouterController {

    @Autowired
    private lateinit var routersService : IRouterService

    @GetMapping("/allowed/{clientId}")
    fun getAllowedClients(@PathVariable clientId : Long , secret : String) : BaseResponse<List<String>>{
        val routerClient = routersService.findByClientId(clientId) ?: throw RouterClientNotFound()
        if(routerClient.secret != secret){
            throw RouterSecretError()
        }
        val allowedClients = routersService.allowedClients(routerClient.id)
        return BaseResponse.ok(allowedClients)
    }

    @GetMapping("/{clientId}")
    fun getRouterClient(@PathVariable clientId : Long, secret : String): BaseResponse<RouterClientEntity> {
        val routerClient = routersService.findByClientId(clientId) ?: throw RouterClientNotFound()
        if(routerClient.secret != secret){
            throw RouterSecretError()
        }
        if(routerClient.locked!!){
            throw RouterClientLocked()
        }
        return BaseResponse.ok(routerClient)
    }
}