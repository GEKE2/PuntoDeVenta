package com.goya.puntodeventa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goya.puntodeventa.business.ClienteBusiness;
import com.goya.puntodeventa.dto.ClienteDTO;

@SpringBootTest
public class BusinessTest {

    @Autowired
    private ClienteBusiness clienteBusiness;

    @Test
    public void testObtenerTodosLosClientesConBD() {
        List<ClienteDTO> clientesDTO = clienteBusiness.obtenerTodoLosClientes();

        assertFalse(clientesDTO.isEmpty());

        ClienteDTO clientes = clientesDTO.get(0);
        assertNotNull(clientes.getId());
        assertNotNull(clientes.getNombre());
   
    }
}