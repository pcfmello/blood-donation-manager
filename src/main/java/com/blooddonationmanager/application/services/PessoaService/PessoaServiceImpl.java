package com.blooddonationmanager.application.services.PessoaService;

import org.springframework.stereotype.Service;

import com.blooddonationmanager.application.entities.Pessoa;
import com.blooddonationmanager.application.repositories.PessoaRepository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salvar(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    // public List<Pessoa> findAll() {
    //     return this.pessoaRepository.findAll();
    // }

    // public void delete(Long id) {
    //     this.pessoaRepository.deleteById(id);
    // }

    // public Pessoa findById(Long id) throws Exception {
    //     Optional<Pessoa> optional = pessoaRepository.findById(id);
    //     return optional.orElseThrow(() -> new Exception("Não existe cliente com id: " + id));
    // }
    
}
