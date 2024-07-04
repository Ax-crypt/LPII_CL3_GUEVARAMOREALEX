package com.bd.servicio;

import java.util.List;

import com.bd.modelo.TblProductocl3;

public interface IProductoServicio {
	public List<TblProductocl3> ListadoProductos();
	public void RegistrarProducto(TblProductocl3 producto);
	public void EliminarProducto(Integer id);
	public TblProductocl3 BuscarProducto(Integer id);

}
