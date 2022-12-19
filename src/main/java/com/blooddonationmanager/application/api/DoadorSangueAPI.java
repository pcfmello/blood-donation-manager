package com.blooddonationmanager.application.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.blooddonationmanager.application.dtos.DoadorSangueDTO;
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

        ResponseEntity.ok().build();
    }
}
