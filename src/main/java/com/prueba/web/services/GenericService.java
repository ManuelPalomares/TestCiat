package com.prueba.web.services;

import java.util.List;
import java.util.Optional;



/**
 * @author mpalomares genericService
 *
 */
public interface GenericService<T, ID> {

	public List<T> findAll();

	public T save(T entity) throws Exception;

	public T update(T entity) throws Exception;

	public void delete(T entity) throws Exception;

	public void deleteById(ID id) throws Exception;

	public Optional<T> findById(ID clieId) throws Exception;

	public void validate(T entity) throws Exception;

	public Long count();

}
