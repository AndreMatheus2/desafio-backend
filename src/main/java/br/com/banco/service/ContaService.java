package br.com.banco.service;

import br.com.banco.model.Conta;
import br.com.banco.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository repository;
    public List<Conta> findAll(){
        return repository.findAll();
    }

}