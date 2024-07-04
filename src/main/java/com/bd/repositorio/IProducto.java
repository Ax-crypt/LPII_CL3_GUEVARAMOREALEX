package com.bd.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.modelo.TblProductocl3;

public interface IProducto extends CrudRepository<TblProductocl3, Integer>{
	
}
