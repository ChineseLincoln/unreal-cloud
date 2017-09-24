package org.unreal.cloud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class UserCenterApplication{

    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            SpringApplication.run(UserCenterApplication::class.java,*args)
        }
    }
}