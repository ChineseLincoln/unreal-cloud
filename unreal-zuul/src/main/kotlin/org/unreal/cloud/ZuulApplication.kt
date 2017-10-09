package org.unreal.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.zuul.EnableZuulServer

@SpringBootApplication
@EnableZuulServer
@EnableDiscoveryClient
open class  ZuulApplication{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(ZuulApplication::class.java, *args)
        }
    }

}