package com.formaciondbi.springboot.app.productos.productos.models.controllers;

import com.formaciondbi.springboot.app.productos.productos.models.entity.Producto;
import com.formaciondbi.springboot.app.productos.productos.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private IProductoService iProductoService;

    @GetMapping
    public List<Producto> findAll(){
        return iProductoService.findAll().stream().map(p -> p.port(port)).collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public Producto findById(@PathVariable("id") Long id){
        return iProductoService.findById(id).port(port);
    }

}
