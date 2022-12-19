package com.blooddonationmanager.application.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DoadorSangueDTO {
    
    private String nome;
    private String cpf;
    private String rg;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private String data_nasc;

    private String sexo;
    private String mae;
    private String pai;
    private String email;
    private String cep;
    private String endereco;
    private Short numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone_fixo;
    private String celular;
    private Float altura;
    private Short peso;
    private String tipo_sanguineo;
}
