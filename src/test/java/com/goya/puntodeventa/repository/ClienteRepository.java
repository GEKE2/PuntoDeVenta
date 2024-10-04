package com.goya.puntodeventa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goya.puntodeventa.empity.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}
