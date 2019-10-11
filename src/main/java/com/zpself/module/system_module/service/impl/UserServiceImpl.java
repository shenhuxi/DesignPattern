package com.zpself.module.system_module.service.impl;

import com.zpself.module.jpa.repository.BaseRepository;
import com.zpself.module.jpa.service.impl.BaseServiceImpl;
import com.zpself.module.system_module.entity.SysUser;
import com.zpself.module.system_module.repository.UserRepository;
import com.zpself.module.system_module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public 	class UserServiceImpl extends BaseServiceImpl<SysUser,Long> implements UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserServiceImpl( UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public BaseRepository<SysUser, Long> getCommonRepository() {
		return userRepository;
	}

	@Override
	public SysUser findByUserName(String teacherName) {
		return userRepository.findByName(teacherName);
	}

}