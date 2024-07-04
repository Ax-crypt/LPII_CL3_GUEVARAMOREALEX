package com.bd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bd.modelo.TbCliente;
import com.bd.servicio.IClienteServicio;

public class ClienteController {
	//inyeccion de dependencia...

	  @Autowired

	  private IClienteServicio iclienteservicio;

	  //creamos el metodo listado..

	  @GetMapping("ListadoCliente")

	  public String ListadoAuto(Model modelo) {

	   //recuperamos el listado de autos..

	   List<TbCliente> listado=iclienteservicio.ListadoClientes();

	   for(TbCliente lis:listado) {

	  System.out.println("codigo "+lis.getIdcliente()+" "+" nombre "+lis.getNombre());

	   }

	   //enviamos la data hacia la vista..

	   modelo.addAttribute("listado",listado);

	   //retornamos

	   return "/Vistas/ListadoAuto";

	   

	  }  //fin del metodo listado auto...

	  

	  //creamos los respectivos para metodos para registrar...

	  @GetMapping("/RegistrarCliente")

	  public String RegistrarCliente(Model modelo) {

	   //realizamos la respectiva instancia...

	   TbCliente cliente=new TbCliente();

	   //enviamos a la vista...

	   modelo.addAttribute("regcliente",cliente);

	   //retornamos

	   return "/Vistas/FrmCrearCliente";

	   

	  }  //fin del metodo registrar.

	  

	  //realizamos el mapeo con postmapping

	  @PostMapping("/GuardarCliente")

	  public String GuardarAuto(@ModelAttribute TbCliente  cliente,Model modelo) {

	   iclienteservicio.RegistrarCliente(cliente);

	   System.out.println("dato registrado en la bd");

	   //retornamos al listado...

	   return "redirect:/Vistas/ListadoClientes"; 

	  }  //fin del metodo string...

	  

	  //*crearmos el metodo editar...

	  @GetMapping("/editar/{id}")

	  public String Editar(@PathVariable("id") Integer idcliente,Model modelo) {

	   TbCliente cliente=iclienteservicio.BuscarporId(idcliente);

	   //enviamos hacia la vista...

	   modelo.addAttribute("regcliente",cliente);

	   //retornamos el frmcrearcliente...

	   return "/Vistas/FrmCrearCliente"; 

	  }  //fin del metodo editar...

}
