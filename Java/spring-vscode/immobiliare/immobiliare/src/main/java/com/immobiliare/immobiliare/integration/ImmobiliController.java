package com.immobiliare.immobiliare.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immobiliare.immobiliare.entitities.Immobile;
import com.immobiliare.immobiliare.services.ImmobiliService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class ImmobiliController {

    @Autowired
    private ImmobiliService service;

    @GetMapping("immobili")
    public List<Immobile> getImmobili() {
        return service.findAll();
    }
    





}
