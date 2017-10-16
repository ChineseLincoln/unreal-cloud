package org.unreal.cloud.user

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
open class UserCenterApplication{

    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            SpringApplication.run(UserCenterApplication::class.java,*args)
        }
    }
}