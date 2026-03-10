package com.immobiliare.immobiliare.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.immobiliare.immobiliare.entitities.Immobile;
import com.immobiliare.immobiliare.entitities.StatoImmobile;

public interface ImmobileRepo extends JpaRepository<Immobile, Integer>{

    List<Immobile> findByStato(StatoImmobile stato);


}
