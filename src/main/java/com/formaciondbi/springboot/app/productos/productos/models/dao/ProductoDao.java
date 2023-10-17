package com.formaciondbi.springboot.app.productos.productos.models.dao;

import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends CrudRepository<Producto,Long> {

}
