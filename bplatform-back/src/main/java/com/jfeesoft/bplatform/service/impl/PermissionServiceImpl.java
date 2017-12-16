package com.jfeesoft.bplatform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jfeesoft.bplatform.model.Permission;
import com.jfeesoft.bplatform.repository.PermissionRepository;
import com.jfeesoft.bplatform.service.PermissionService;

@Component
@Transactional
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

	@Autowired
	public PermissionServiceImpl(PermissionRepository permissionRepository) {
		super(permissionRepository);

	}
}
