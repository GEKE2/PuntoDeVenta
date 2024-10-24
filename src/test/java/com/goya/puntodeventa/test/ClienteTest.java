package com.goya.puntodeventa.test;

import org.junit.jupiter.api.Test;
import com.goya.puntodeventa.entity.Cliente;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testClienteEntity() {
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@gmail.com");

        assertNull(cliente.getId());
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("juan.perez@gmail.com", cliente.getEmail());

        cliente.setId(1L);
        cliente.setNombre("Maria Gomez");
        cliente.setEmail("maria.gomez@outttt.com");

        assertEquals(1L, cliente.getId());
        assertEquals("Maria Gomez", cliente.getNombre());
        assertEquals("maria.gomez@outttt.com", cliente.getEmail());
    }
}

