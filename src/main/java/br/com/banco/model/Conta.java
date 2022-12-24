package br.com.banco.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long idConta;
    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

}