package com.goya.puntodeventa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.goya.puntodeventa.entity.Cliente;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class ConexionbnApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private ClienteRepository clienteRepository;

    public static void main(String[] args) {
        SpringApplication.run(ConexionbnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (dataSource.getConnection() != null) {
            System.out.println("Conexion exitosa a la base de datos");

            List<Cliente> clientes = clienteRepository.findAll();
            for (Cliente cliente : clientes) {
			    System.out.println("Cliente: " + cliente.getNombre() + ", Email: " + cliente.getEmail());
            }
        } else {
            System.out.println("Error en la conexion a la base de datos");
        }
    }
}
