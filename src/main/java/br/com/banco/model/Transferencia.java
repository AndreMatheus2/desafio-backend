package br.com.banco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transferencia")
public class Transferencia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTransferencia;

    private Double valor;

    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String operadorTransacao;

    @Column(name = "conta_id")
    private Long contaId;

}