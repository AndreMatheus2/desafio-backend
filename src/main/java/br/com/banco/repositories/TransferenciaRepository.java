package br.com.banco.repositories;

import br.com.banco.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {


    Optional<Transferencia> findByNomeOperadorTransacao(String nomeOperadorTransacao);

    List<Transferencia> findAll();
}
