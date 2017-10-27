package org.unreal.cloud.router.service

import org.unreal.cloud.router.model.RouterClientEntity

interface IRouterService {
    fun allowedClients(serviceId: Long): List<String>
    fun findByClientId(clientId: Long): RouterClientEntity?
}