package br.com.banco.service;

import br.com.banco.controller.PesquisaOperadorTransacionalController;
import br.com.banco.model.Transferencia;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PesquisaOperadorTransacionalService {

    @Autowired
    private ContaRepository contaRepository;
    @Autowired
    private TransferenciaRepository transferenciaRepository;
    @Autowired
    PesquisaOperadorTransacionalController controller;
    public Transferencia findByNomeOperadorTransacao(Transferencia transferencia) {
        Optional<Transferencia> transferenciaOptional = transferenciaRepository.findByNomeOperadorTransacao(transferencia.getNomeOperadorTransacao());
        return transferenciaOptional.get();
    }

    public List<Transferencia> findByDataTransferencia(Transferencia transferencia){
        List<Transferencia> list = transferenciaRepository.findAll();
        return list;
    }
}
