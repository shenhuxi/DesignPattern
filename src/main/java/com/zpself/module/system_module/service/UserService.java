package com.zpself.module.system_module.service;

import com.zpself.module.jpa.service.BaseService;
import com.zpself.module.system_module.entity.SysUser;

public interface UserService extends BaseService<SysUser,Long> {
    SysUser findByUserName(String teacherName);
}
