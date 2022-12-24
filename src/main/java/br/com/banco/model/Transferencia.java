package br.com.banco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transferencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date dataTransferencia;
    private Double valor;
    private String tipo;
    private String nomeOperadorTransacao;

    private Integer contaId;
    private String nomeOperadorTransferencia;

}