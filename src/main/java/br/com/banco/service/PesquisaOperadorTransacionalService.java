package br.com.banco.service;

import br.com.banco.controller.PesquisaOperadorTransacionalController;
import br.com.banco.dto.ContaDTO;
import br.com.banco.dto.TransferenciaDTO;
import br.com.banco.model.Conta;
import br.com.banco.repositories.ContaRepository;
import br.com.banco.repositories.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PesquisaOperadorTransacionalService {

    @Autowired
    private ContaRepository contaRepository;
    @Autowired
    private TransferenciaRepository transferenciaRepository;
    @Autowired
    PesquisaOperadorTransacionalController controller;
    public TransferenciaDTO findByNomeOperadorTransacao(TransferenciaDTO transferenciaDTO) {
        Optional<TransferenciaDTO> transferencia = transferenciaRepository.findByNomeOperadorTransacao(transferenciaDTO.getNomeOperadorTransacao());
        return transferencia.get();
    }
}
