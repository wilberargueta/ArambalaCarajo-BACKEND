package com.arambalacarajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arambalacarajo.entity.ProductoCategoriaProducto;

@Repository("productoCategoriaProductoRepository")
public interface ProductoCategoriaProductoRepository
extends JpaRepository<ProductoCategoriaProducto, Integer> {
public ProductoCategoriaProducto findProductoCategoriaProductoByIdProductoCategoriaProducto(int id);
}
