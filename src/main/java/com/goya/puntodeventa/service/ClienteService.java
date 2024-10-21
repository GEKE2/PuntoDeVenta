package com.goya.puntodeventa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goya.puntodeventa.business.ClienteBusiness;
import com.goya.puntodeventa.dto.ClienteDTO;

@Service
public class ClienteService {
  @Autowired
  private ClienteBusiness clienteBusiness;
  
  public List<ClienteDTO> obtenerTodosLosClientes(){
	  return clienteBusiness.obtenerTodoLosClientes();
  }
  
}
