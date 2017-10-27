package org.unreal.cloud.router.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.unreal.cloud.router.model.RouterRelationsEntity

interface RouterRelationsDao : JpaRepository<RouterRelationsEntity, Long> {
    @Query("SELECT client.code from router_relations as relations " +
            "INNER JOIN router_client as client " +
            "ON relations.client_id = client.id " +
            "WHERE relations.service_id = ?1 and client.locked <> 1" , nativeQuery = true)
    fun findByServiceId(serviceId: Long): List<String>
}