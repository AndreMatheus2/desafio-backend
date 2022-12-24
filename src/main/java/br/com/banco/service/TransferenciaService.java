package br.com.banco.service;

import br.com.banco.model.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository repository;

    public List<Transferencia> findAll(){
        return repository.findAll();
    }

    public List<Transferencia> findByIdConta(Long contaId) {
        return repository.findByContaId(contaId);
    }

    public List<Transferencia> findOperadorTransacao(String operadorTransacao) {
        return  repository.findByOperadorTransacao(operadorTransacao);
    }

    public List<Transferencia> buscarPeriodo(LocalDateTime dateInicio, LocalDateTime dateFim) {
        return repository.buscaPorPeriodoDeDatas(dateInicio, dateFim);
    }
}