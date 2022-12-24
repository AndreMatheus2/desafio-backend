package br.com.banco.controller;



import br.com.banco.model.Transferencia;
import br.com.banco.service.PesquisaOperadorTransacionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class PesquisaOperadorTransacionalController {


    @Autowired
    private PesquisaOperadorTransacionalService service;

    @GetMapping("/{nome}")
    public ResponseEntity<Transferencia> findByName(@PathVariable Transferencia transferencia) {
        Transferencia obj = this.service.findByNomeOperadorTransacao(transferencia);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping("/{data}")
    public ResponseEntity<List<Transferencia>> findByData(@PathVariable Transferencia transferencia){
        List<Transferencia> list = this.service.findByDataTransferencia(transferencia);
        return ResponseEntity.ok().body(list);
    }

}
