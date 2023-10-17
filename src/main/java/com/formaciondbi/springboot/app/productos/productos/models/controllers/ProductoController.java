package com.formaciondbi.springboot.app.productos.productos.models.controllers;

import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;
import com.formaciondbi.springboot.app.productos.productos.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private Environment environment;

    @Autowired
    private IProductoService iProductoService;

    @GetMapping
    public List<Producto> findAll(){
        return iProductoService.findAll().stream().map(p -> p.port(Integer.parseInt(environment.getProperty("local.server.port")))).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public Producto findById(@PathVariable("id") Long id){
        return iProductoService.findById(id).port(Integer.parseInt(environment.getProperty("local.server.port")));
    }

}
