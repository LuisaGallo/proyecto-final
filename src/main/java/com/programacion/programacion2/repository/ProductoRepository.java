package com.programacion.programacion2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacion.programacion2.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
