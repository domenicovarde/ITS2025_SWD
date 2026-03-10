package com.immobiliare.immobiliare.services;

import java.util.List;

import com.immobiliare.immobiliare.entitities.Immobile;

public interface ImmobiliService {

    List<Immobile> findAll();
    Immobile findImmobileById(int id);

    Immobile addImmobile(Immobile i);


}
