package com.goya.puntodeventa.test;
import org.junit.jupiter.api.Test;
import com.goya.puntodeventa.entity.Cliente;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

		@Test
	    public void testCliente() {
			
			Cliente cliente = new Cliente("Veronica Cortez","veronicavv@gmail.com");
	        
	       
	        assertEquals(null, cliente.getId());
	        assertEquals("Veronica Cortez", cliente.getNombre());
	        assertEquals("veronicavv@gmail.com", cliente.getEmail());
	    
	        
	    }
}
