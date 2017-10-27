package org.unreal.cloud.router.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.unreal.cloud.router.model.RouterClientEntity

interface RouterClientDao : JpaRepository<RouterClientEntity , Long>