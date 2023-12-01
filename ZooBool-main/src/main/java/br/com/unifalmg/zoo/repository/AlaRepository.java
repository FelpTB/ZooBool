package br.com.unifalmg.zoo.repository;

import br.com.unifalmg.zoo.entity.Ala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlaRepository extends JpaRepository<Ala, Integer> {

}