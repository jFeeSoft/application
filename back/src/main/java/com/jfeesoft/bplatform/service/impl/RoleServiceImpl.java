package com.jfeesoft.bplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jfeesoft.bplatform.model.Role;
import com.jfeesoft.bplatform.repository.RoleRepository;
import com.jfeesoft.bplatform.service.RoleService;

@Component
@Transactional
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

	@Autowired
	public RoleServiceImpl(RoleRepository roleRepository) {
		super(roleRepository);

	}

}
