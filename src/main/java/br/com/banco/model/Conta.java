package br.com.banco.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

    /*@OneToMany(mappedBy = "conta", cascade = CascadeType.ALL)
    private List<Transferencia> transferencias;*/

    /**
     * Contrutores*/
    public Conta() {

    }

    public Conta(Long idConta, String nomeResponsavel) {
        this.idConta = idConta;
        this.nomeResponsavel = nomeResponsavel;
    }
}