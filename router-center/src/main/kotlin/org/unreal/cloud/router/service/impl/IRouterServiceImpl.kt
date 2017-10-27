package org.unreal.cloud.router.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.unreal.cloud.router.dao.RouterClientDao
import org.unreal.cloud.router.dao.RouterRelationsDao
import org.unreal.cloud.router.model.RouterClientEntity
import org.unreal.cloud.router.service.IRouterService
import javax.transaction.Transactional

@Service
@Transactional
open class IRouterServiceImpl : IRouterService {

    @Autowired
    private lateinit var routerClientDao: RouterClientDao

    @Autowired
    private lateinit var routerRelationsDao: RouterRelationsDao


    override fun allowedClients(serviceId: Long): List<String> {
        return routerRelationsDao.findByServiceId(serviceId)
    }

    override fun findByClientId(clientId: Long): RouterClientEntity? {
        return routerClientDao.findOne(clientId)
    }
}