package br.com.unifalmg.zoo.repository;

import br.com.unifalmg.zoo.entity.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Integer> {
    // Adicione métodos específicos, se necessário
}

