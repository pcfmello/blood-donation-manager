package com.blooddonationmanager.application.repositories.ContatoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blooddonationmanager.application.entities.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
    
}
