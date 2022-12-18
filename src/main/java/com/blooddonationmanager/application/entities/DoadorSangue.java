package com.blooddonationmanager.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(name = "doador_sangue")
public class DoadorSangue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO Fazer agregação
    private Pessoa pessoa;

    // TODO Fazer agregação
    private Endereco endereco;

    // TODO Fazer agregação
    private Contato contato;

    @Column(name = "tipo_sanguineo")
    @Enumerated(EnumType.STRING)
    private String tipoSanguineo;
    
}
