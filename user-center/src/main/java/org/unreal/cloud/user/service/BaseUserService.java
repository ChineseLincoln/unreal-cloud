package org.unreal.cloud.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.unreal.cloud.user.dao.BaseUserDao;
import org.unreal.cloud.user.model.BaseUserEntity;

import javax.transaction.Transactional;

@Service
@Transactional
public class BaseUserService {

    @Autowired
    BaseUserDao baseUserDao;

    public Page<BaseUserEntity> getAllUser(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(0, 1, sort);
        return baseUserDao.findAll(pageable);
    }
}
