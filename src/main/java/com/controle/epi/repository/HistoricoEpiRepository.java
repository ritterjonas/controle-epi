package com.controle.epi.repository;

import com.controle.epi.model.HistoricoEpi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoEpiRepository extends JpaRepository<HistoricoEpi, Long> {

}
