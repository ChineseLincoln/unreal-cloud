package org.unreal.cloud.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unreal.cloud.user.model.BaseUserEntity;

@Repository
public interface BaseUserDao extends JpaRepository<BaseUserEntity , Integer> {
}
