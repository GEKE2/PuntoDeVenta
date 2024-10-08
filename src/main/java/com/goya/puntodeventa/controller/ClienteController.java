package com.goya.puntodeventa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goya.puntodeventa.dto.ClienteDTO;
import com.goya.puntodeventa.service.ClienteService;


@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteservice;
	
	public List<ClienteDTO> consultarTodosLosClientes(){
		return clienteservice.obtenerTodosLosClientes();
	}
}
