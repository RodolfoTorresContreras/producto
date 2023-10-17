package com.formaciondbi.springboot.app.productos.productos.models.services;

import com.formaciondbi.springboot.app.productos.productos.models.dao.ProductoDao;
import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicesImpl implements IProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(new Producto());
    }
}
