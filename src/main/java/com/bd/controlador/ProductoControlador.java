package com.bd.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.modelo.TblProductocl3;
import com.bd.servicio.IProductoServicio;



@Controller
@RequestMapping("/Vistas")
public class ProductoControlador {
	//inyeccion de dependencia...


	  @Autowired
	  private IProductoServicio iProductoServicio;
	  //creamos el metodo listado..
	  @GetMapping("ListadoProducto")
	  public String ListadoProducto(Model modelo) {
	   //recuperamos el listado de autos..
	   List<TblProductocl3> listado=iProductoServicio.ListadoProductos();
	   for(TblProductocl3 lis:listado) {
	  System.out.println("codigo "+lis.getIdproducto()+" "+" nombre "+lis.getNombre());
	   }
	   //enviamos la data hacia la vista..
	   modelo.addAttribute("listado",listado);
	   //retornamos
	   return "/Vistas/ListadoProducto";	   
	  }  //fin del metodo listado auto...

	  

	  //creamos los respectivos para metodos para registrar...
	  @GetMapping("/RegistrarProducto")
	  public String Registrar(Model modelo) {
	   //realizamos la respectiva instancia...
	 TblProductocl3 producto = new TblProductocl3();
	   //enviamos a la vista...
	   modelo.addAttribute("regproducto",producto);
	   //retornamos
	   return "/Vistas/CrearProducto";	   
	  }  //fin del metodo registrar.
	  
	  
	  //realizamos el mapeo con postmapping
	  @PostMapping("/RegistrarProducto")
	  public String GuardarProducto(@ModelAttribute TblProductocl3  producto,Model modelo) {
		  iProductoServicio.RegistrarProducto(producto);
	   System.out.println("dato registrado en la bd");
	   //retornamos al listado...
	   return "redirect:/Vistas/ListadoProducto"; 
	  }  //fin del metodo string...

	  

	  //*crearmos el metodo editar...
	  @GetMapping("/editar/{id}")
	  public String Editar(@PathVariable("id") Integer idproducto,Model modelo) {
		  TblProductocl3 producto=iProductoServicio.BuscarProducto(idproducto);
	   //enviamos hacia la vista...
	   modelo.addAttribute("regproducto",producto);
	   //retornamos el frmcrearcliente...
	   return "/Vistas/CrearProducto"; 
	  }  //fin del metodo editar...

}
