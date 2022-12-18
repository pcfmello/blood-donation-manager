package com.blooddonationmanager.application.services.DoadorSangueService;

import java.util.HashMap;
import java.util.List;

import com.blooddonationmanager.application.entities.DoadorSangue;

public interface DoadorSangueService {

    List<DoadorSangue> salvar(List<DoadorSangue> doadoresDeSangue);
    HashMap<String, Integer> obterTotalPorEstado();
    HashMap<String, Double> obterPercentualDeObesosEntreHomensEMulheres();
    HashMap<String, Short> obterMediaDeIdadePorTipoSanguineo();
    HashMap<String, Short> obterTotalDePossiveisDoadoresParaCadaTipoSanguineoReceptor();

    
}
