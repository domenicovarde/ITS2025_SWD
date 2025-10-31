package com.immobiliare.immobiliare.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immobiliare.immobiliare.entitities.Immobile;
import com.immobiliare.immobiliare.repositories.ImmobileRepo;

@Service
public class ImmobiliareServiceImpl implements ImmobiliService{


    @Autowired
    private ImmobileRepo repo;


    @Override
    public List<Immobile> findAll() {
        return repo.findAll();
    }

    @Override
    public Immobile findImmobileById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public Immobile addImmobile(Immobile i) {
        return repo.save(i);
    }

}
