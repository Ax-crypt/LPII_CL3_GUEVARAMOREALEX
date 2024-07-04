package com.bd.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productoscl3")
public class TblProductocl3 {

		@Id
		private int idproducto;
		private String nombre;
		private double precioVenta;
		private int stock;
		private double precioCompra;
		private String estado;
		private String descripcion;
		

		@Override
		public String toString() {
			return "TblProductocl3 [idproducto=" + idproducto + ", nombre=" + nombre + ", precioVenta=" + precioVenta
					+ ", stock=" + stock + ", precioCompra=" + precioCompra + ", estado=" + estado + ", descripcion="
					+ descripcion + "]";
		}
		public double getPrecioVenta() {
			return precioVenta;
		}
		public void setPrecioVenta(double precioVenta) {
			this.precioVenta = precioVenta;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public double getPrecioCompra() {
			return precioCompra;
		}
		public void setPrecioCompra(double precioCompra) {
			this.precioCompra = precioCompra;
		}
		public TblProductocl3() {
		}
		public int getIdproducto() {
			return this.idproducto;
		}
		public void setIdproducto(int idproducto) {
			this.idproducto = idproducto;
		}
		public String getDescripcion() {
			return this.descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getEstado() {
			return this.estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getNombre() {
			return this.nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


	}
