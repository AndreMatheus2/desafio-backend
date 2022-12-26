package br.com.banco.resources;

import br.com.banco.model.Transferencia;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/operacao")
public class TransferenciaResource {

    @Autowired
    private TransferenciaService service;

    @GetMapping
    public ResponseEntity<List<Transferencia>> findAll(){
        List<Transferencia> transferenciaLista = service.findAll();
        return ResponseEntity.ok().body(transferenciaLista);
    }

    @GetMapping(value = "/{contaId}")
    public ResponseEntity<List<Transferencia>> findByIdConta(@PathVariable Long contaId){
        List<Transferencia> transferencias = service.findByIdConta(contaId);
        return ResponseEntity.ok().body(transferencias);
    }

    @GetMapping(value = "/operador/{operadorTransacao}")
    public ResponseEntity<List<Transferencia>> findByoperador(@PathVariable String operadorTransacao){
        List<Transferencia> transferencias = service.findOperadorTransacao(operadorTransacao);
        return ResponseEntity.ok().body(transferencias);
    }

    // @GetMapping(value = "/periodo")
    // @RequestParam
    @GetMapping(value = "/periodo/{dataInicio},{dataFim}")
    public ResponseEntity<List<Transferencia>> findTipoOperacao(@PathVariable LocalDateTime dataInicio, @PathVariable LocalDateTime dataFim){
        List<Transferencia> transferencias = service.buscarPeriodo(dataInicio, dataFim);
        return ResponseEntity.ok().body(transferencias);
        // return new ResponseEntity<List<Transferencia>>(service.buscarPeriodo(dataInicio, dataFim), HttpStatus.OK);
    }

}