package com.blooddonationmanager.application.services.DoadorSangueService;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blooddonationmanager.application.entities.DoadorSangue;
import com.blooddonationmanager.application.repositories.DoadorSangueRepository.DoadorSangueRepository;

@Service
public class DoadorSangueServiceImpl implements DoadorSangueService {

    private final DoadorSangueRepository doadorSangueRepository;

    public DoadorSangueServiceImpl(DoadorSangueRepository doadorSangueRepository) {
        this.doadorSangueRepository = doadorSangueRepository;
    }

    public List<DoadorSangue> salvar(List<DoadorSangue> doadoresSangue) {
        return this.doadorSangueRepository.saveAll(doadoresSangue);
    }

    public HashMap<String, Integer> obterTotalPorEstado() {
        return null;        
    }

    public HashMap<String, Double> obterPercentualDeObesosEntreHomensEMulheres() {
        return null;
    }

    public HashMap<String, Short> obterMediaDeIdadePorTipoSanguineo() {
        return null;
    }

    public HashMap<String, Short> obterTotalDePossiveisDoadoresParaCadaTipoSanguineoReceptor() {
        return null;
    }    
}
