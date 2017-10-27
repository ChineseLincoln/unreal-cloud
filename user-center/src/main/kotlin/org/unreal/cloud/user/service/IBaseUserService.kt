package org.unreal.cloud.user.service

import org.unreal.cloud.user.model.BaseUserEntity

interface IBaseUserService{
    fun register(account: String, encodePassword: String)
    fun login(account: String, password: String): BaseUserEntity
    fun accountAlreadyUsed(account: String): Boolean
}