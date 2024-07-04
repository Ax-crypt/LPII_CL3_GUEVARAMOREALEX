package com.bd.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.modelo.TblProductoCl3;
import com.bd.repositorio.IProducto;

@Service
public class ProductoServicio implements IProductoServicio{
	@Autowired
	private IProducto iProductoRepository;

	@Override
	public List<TblProductoCl3> ListadoProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RegistrarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ActualizarProducto(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarProducto(Integer id) {
		iProductoRepository.deleteById(id);
		
	}

	@Override
	public TblProductoCl3 BuscarProducto(Integer id) {
		
		return iProductoRepository.findById(id).orElseThrow(null);
	}
	

}
