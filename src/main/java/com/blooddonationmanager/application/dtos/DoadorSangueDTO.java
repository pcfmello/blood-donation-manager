package com.blooddonationmanager.application.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty("data_nasc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private String dataNasc;

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

    @JsonProperty("telefone_fixo")
    private String telefoneFixo;

    private String celular;
    private Float altura;
    private Short peso;

    @JsonProperty("tipo_sanguineo")
    private String tipoSanguineo;
}
