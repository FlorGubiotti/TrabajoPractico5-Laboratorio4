package com.example.trabajoPractico5.controllers;

import com.example.trabajoPractico5.entities.Categoria;
import com.example.trabajoPractico5.services.CategoriaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/categoria")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    private CategoriaServiceImpl service;
    public CategoriaController(CategoriaServiceImpl service) {
        super(service);
    }
}
