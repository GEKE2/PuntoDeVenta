package com.goya.puntodeventa.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

import com.goya.puntodeventa.dto.ClienteDTO;
import com.goya.puntodeventa.entity.Cliente;
import com.goya.puntodeventa.repository.ClienteRepository;

@Component
public class ClienteBusiness {
       @Autowired
       ClienteRepository clienteRepsitory;
       
       
       public List<ClienteDTO>obtenerTodoLosClientes(){
		return clienteRepsitory.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    	   
       }
       
       
       public ClienteDTO mapToDTO(Cliente cliente) {
    	    
    	   ClienteDTO clienteDTO = new ClienteDTO( 
    			   cliente.getId(), cliente.getNombre(), cliente.getEmail()
    			   );
    	   
    	  // clienteDTO.setId(cliente.getId());
    	 // clienteDTO.setNombre(cliente.getNombre());
    	// clienteDTO.setEmail(cliente.getEmail());
    	   
    	   return clienteDTO;
    	   
       }

}
