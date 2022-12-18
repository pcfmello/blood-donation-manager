package com.blooddonationmanager.application.dtos;

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
