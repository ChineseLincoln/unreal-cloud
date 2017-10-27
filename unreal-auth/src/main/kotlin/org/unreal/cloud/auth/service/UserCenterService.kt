package org.unreal.cloud.auth.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.unreal.cloud.common.feign.UserFeignDto
import org.unreal.cloud.common.vo.BaseResponse

@FeignClient("user-center")
interface UserCenterService{

    @GetMapping("/users/login")
    fun login(@RequestParam("account") account : String , @RequestParam("password") password:String) : BaseResponse<UserFeignDto>

}
