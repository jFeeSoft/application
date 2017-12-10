package com.jfeesoft.bplatform.service.impl;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.jfeesoft.bplatform.service.GenericService;

public abstract class GenericServiceImpl<T, K extends Serializable> implements GenericService<T, K> {

	protected CrudRepository<T, K> repository;

	public GenericServiceImpl(CrudRepository crudRepository) {
		this.repository = crudRepository;
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public Iterable<T> findAll() {
		return repository.findAll();
	}

}
