package com.jfeesoft.bplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jfeesoft.bplatform.model.SystemUser;
import com.jfeesoft.bplatform.repository.SystemUserRepository;
import com.jfeesoft.bplatform.service.SystemUserService;

@Component
@Transactional
public class SystemUserServiceImpl extends GenericServiceImpl<SystemUser, Long> implements SystemUserService {

	@Autowired
	public SystemUserServiceImpl(SystemUserRepository systemUserRepository) {
		super(systemUserRepository);

	}
}
