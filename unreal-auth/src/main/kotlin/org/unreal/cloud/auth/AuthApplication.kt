package org.unreal.cloud.auth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.cloud.netflix.zuul.EnableZuulServer

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
open class  AuthApplication{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(AuthApplication::class.java, *args)
        }
    }
}