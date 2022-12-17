package com.blooddonationmanager.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SexoEnum {
    
    MASCULINO("masculino"), 
    FEMININO("feminino");

    private String descricao;
}
