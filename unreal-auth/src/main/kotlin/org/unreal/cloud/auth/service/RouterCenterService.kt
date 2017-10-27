package org.unreal.cloud.auth.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.unreal.cloud.common.feign.RouterClientFeignDto
import org.unreal.cloud.common.vo.BaseResponse

@FeignClient("router-center")
interface RouterCenterService {

    @GetMapping("/routers/{clientId}")
    fun getRouterClient(@PathVariable("clientId") clientId : Long ,@RequestParam("secret") secret : String): BaseResponse<RouterClientFeignDto>
}