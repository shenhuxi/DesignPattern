package com.zpself.module.system_module.repository;

import com.zpself.module.jpa.repository.BaseRepository;
import com.zpself.module.system_module.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * 描述:
 * 作者: qinzhw
 * 创建时间: 2018/8/14 14:42
 */
@Repository
public interface UserRepository extends BaseRepository<SysUser,Long> {
    SysUser findByName(String teacherName);
}