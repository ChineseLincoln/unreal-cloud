package org.unreal.cloud.user.service.impl

import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.unreal.cloud.user.dao.BaseUserDao
import org.unreal.cloud.user.exception.UserNotFoundException
import org.unreal.cloud.user.exception.UserPasswordEncodeException
import org.unreal.cloud.user.model.BaseUserEntity
import org.unreal.cloud.user.service.IBaseUserService

import javax.transaction.Transactional

@Service
@Transactional
open class BaseUserService : IBaseUserService {

    @Autowired
    private lateinit var baseUserDao: BaseUserDao

    override fun register(account: String, encodePassword: String) {
        if(StringUtils.isEmpty(encodePassword)){
            throw UserPasswordEncodeException()
        }
        val userEntity = BaseUserEntity()
        userEntity.account = account
        userEntity.password = encodePassword
        baseUserDao.save(userEntity)
    }

    override fun login(account: String, password: String): BaseUserEntity {
        val user = baseUserDao.findByAccountAndPassword(account , password)
        if(user == null){
            throw UserNotFoundException()
        }else{
            return user
        }
    }

    override fun accountAlreadyUsed(account: String): Boolean {
        return baseUserDao.countByAccount(account) > 0
    }
}
