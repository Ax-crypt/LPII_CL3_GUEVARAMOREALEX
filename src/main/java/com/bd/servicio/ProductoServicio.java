package com.bd.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.modelo.TblProductocl3;
import com.bd.repositorio.IProducto;

@Service
public class ProductoServicio implements IProductoServicio{
	@Autowired
	private IProducto iProductoRepository;

	@Override
	public List<TblProductocl3> ListadoProductos() {
		
		return (List<TblProductocl3>)iProductoRepository.findAll() ;
	}

	@Override
	public void RegistrarProducto(TblProductocl3 producto) {
		iProductoRepository.save(producto);
		
	}

	@Override
	public void EliminarProducto(Integer id) {
		iProductoRepository.deleteById(id);
		
	}

	@Override
	public TblProductocl3 BuscarProducto(Integer id) {
		
		return iProductoRepository.findById(id).orElseThrow(null);
	}

	

}
