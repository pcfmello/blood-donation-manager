package com.blooddonationmanager.application.entities;

import java.io.Serializable;
import java.time.LocalDate;

import com.blooddonationmanager.application.enums.SexoEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity(name = "pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String rg;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column
    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;

    @Column(name = "nome_mae")
    private String nomeMae;

    @Column(name = "nome_pai")
    private String nomePai;

    @Column(name = "altura")
    private Float altura;

    @Column(name = "peso")
    private Short peso;

}
