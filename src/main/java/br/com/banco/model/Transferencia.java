package br.com.banco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transferencia {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private LocalDate dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperadorTransacao;
    @Column(name = "conta_id")
    private Conta contaId;
    private String nomeOperadorTransferencia;

}