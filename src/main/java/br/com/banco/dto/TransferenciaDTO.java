package br.com.banco.dto;

import br.com.banco.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferenciaDTO {

    private Integer id;
    private LocalDate dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperadorTransacao;
    private Conta contaId;
    private String nomeOperadorTransferencia;

}