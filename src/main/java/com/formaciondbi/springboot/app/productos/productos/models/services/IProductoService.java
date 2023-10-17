package com.formaciondbi.springboot.app.productos.productos.models.services;

import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();

    public Producto findById(Long id);


}
