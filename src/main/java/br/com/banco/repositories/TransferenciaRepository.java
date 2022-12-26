package br.com.banco.repositories;

import br.com.banco.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDateTime;
import java.util.List;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
    public List<Transferencia> findByContaId(Long contaId);

    public List<Transferencia> findByOperadorTransacao(String operadorTransacao);


    // @Query(value="SELECT * FROM TRANSFERENCIA WHERE DATA_TRANSFERENCIA BETWEEN dataInicio AND dataFim", nativeQuery=true)
    @Query(value="select * from Transferencia tr where tr.data_transferencia >= :dataInicio And tr.data_transferencia <= :dataFim", nativeQuery=true)
    public List<Transferencia> buscaPorPeriodoDeDatas(LocalDateTime dataInicio, LocalDateTime dataFim);
}
