package br.com.banco.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idConta;
    private String nomeResponsavel;

}
