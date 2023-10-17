package com.formaciondbi.springboot.app.productos.productos.models.controllers;

import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;
import com.formaciondbi.springboot.app.productos.productos.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService iProductoService;

    @GetMapping
    public List<Producto> findAll(){
        return iProductoService.findAll();
    }


    @GetMapping("/{id}")
    public Producto findById(@PathVariable("id") Long id){
        return iProductoService.findById(id);
    }

}
