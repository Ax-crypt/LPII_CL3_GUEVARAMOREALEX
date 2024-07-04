package com.bd.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.modelo.TblProductoCl3;

public interface IProducto extends CrudRepository<TblProductoCl3, Integer>{
	
}
