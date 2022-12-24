package br.com.banco.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConta;
    private String nomeResponsavel;

}