package org.unreal.cloud.user.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.unreal.cloud.common.vo.BaseResponse

@FeignClient("router-center")
interface RouterCenterService {

    @GetMapping("/routers/allowed/{clientId}")
    fun getAllowedRouterClient(@PathVariable("clientId") clientId : Long, @RequestParam("secret") secret : String): BaseResponse<List<String>>
}