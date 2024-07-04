package com.bd.servicio;

import java.util.List;

import com.bd.modelo.TblProductoCl3;

public interface IProductoServicio {
	public List<TblProductoCl3> ListadoProductos();
	public void RegistrarProducto(Integer id);
	public void ActualizarProducto(Integer id);
	public void EliminarProducto(Integer id);
	public TblProductoCl3 BuscarProducto(Integer id);

}
