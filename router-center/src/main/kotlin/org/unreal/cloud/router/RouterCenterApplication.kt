package org.unreal.cloud.router

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class RouterCenterApplication{

    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            SpringApplication.run(RouterCenterApplication::class.java,*args)
        }
    }
}