package org.unreal.cloud.user.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.unreal.cloud.user.model.BaseUserEntity

@Repository
interface BaseUserDao : JpaRepository<BaseUserEntity, Int> {
    fun findByAccountAndPassword(account: String, password: String): BaseUserEntity?
    fun countByAccount(account: String): Int
}
