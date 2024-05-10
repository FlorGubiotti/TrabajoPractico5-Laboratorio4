package com.example.trabajoPractico5.controllers;

import com.example.trabajoPractico5.entities.Instrumento;
import com.example.trabajoPractico5.services.InstrumentoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/instrumentos")
public class InstrumentoController extends BaseControllerImpl<Instrumento, InstrumentoServiceImpl> {
    private InstrumentoServiceImpl service;
    public InstrumentoController(InstrumentoServiceImpl service) {
        super(service);
    }
}
