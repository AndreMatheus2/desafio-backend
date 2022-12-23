package br.com.banco.controller;

import br.com.banco.dto.TransferenciaDTO;
import br.com.banco.service.PesquisaOperadorTransacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableJpaRepositories
@RestController
@RequestMapping("/banco")
public class PesquisaOperadorTransacionalController {

    @Autowired
    private PesquisaOperadorTransacionalService service;
    @GetMapping("/banco")
    public void formulario(){

    }
    @GetMapping("/{nomeResponsavel}")
    public ResponseEntity<TransferenciaDTO> findById(@PathVariable TransferenciaDTO transferenciaDTO) {
        TransferenciaDTO obj = this.service.findByNomeOperadorTransacao(transferenciaDTO);
        return ResponseEntity.ok().body(obj);
    }

}
