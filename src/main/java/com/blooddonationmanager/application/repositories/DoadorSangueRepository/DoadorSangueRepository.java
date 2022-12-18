package com.blooddonationmanager.application.repositories.DoadorSangueRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blooddonationmanager.application.entities.DoadorSangue;

@Repository
public interface DoadorSangueRepository extends JpaRepository<DoadorSangue, Long> {
    
}
