package com.blooddonationmanager.application.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.blooddonationmanager.application.dtos.DoadorSangueDTO;
import com.blooddonationmanager.application.entities.Contato;
import com.blooddonationmanager.application.entities.DoadorSangue;
import com.blooddonationmanager.application.entities.Endereco;
import com.blooddonationmanager.application.entities.Pessoa;
import com.blooddonationmanager.application.enums.SexoEnum;
import com.blooddonationmanager.application.services.DoadorSangueService.DoadorSangueService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "cadastrar")
public class DoadorSangueAPI {

    private final DoadorSangueService doadorSangueService;
    
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void cadastrar(@RequestBody List<DoadorSangueDTO> payload) {
        List<DoadorSangue> doadoresSangue = new ArrayList<>();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (DoadorSangueDTO doadorSangueDTO: payload) {
            doadoresSangue.add(
                new DoadorSangue(
                    null, 
                    
                    new Pessoa(
                        null, 
                        doadorSangueDTO.getNome(), 
                        doadorSangueDTO.getCpf(), 
                        doadorSangueDTO.getRg(),
                        LocalDate.parse(doadorSangueDTO.getDataNasc(), dateFormatter), 
                        obterSexo(doadorSangueDTO.getSexo()), 
                        doadorSangueDTO.getMae(), 
                        doadorSangueDTO.getPai(), 
                        doadorSangueDTO.getAltura(), 
                        doadorSangueDTO.getPeso(), 
                        
                        new Endereco(
                            null, 
                            doadorSangueDTO.getCep(), 
                            doadorSangueDTO.getEndereco(), 
                            doadorSangueDTO.getNumero(), 
                            doadorSangueDTO.getBairro(), 
                            doadorSangueDTO.getCidade(), 
                            doadorSangueDTO.getEstado()
                        ), 

                        new Contato(
                            null, 
                            doadorSangueDTO.getEmail(), 
                            doadorSangueDTO.getTelefoneFixo(), 
                            doadorSangueDTO.getCelular()
                        )
                    ), 
                    doadorSangueDTO.getTipoSanguineo()
                )
            );
        }
        
        this.doadorSangueService.salvar(doadoresSangue);

        ResponseEntity.ok().build();
    }

    private SexoEnum obterSexo(String sexo) {
        return sexo.toLowerCase().equals("feminino") ? SexoEnum.FEMININO : SexoEnum.MASCULINO;
    }

}
