package br.com.unifalmg.zoo.repository;

import br.com.unifalmg.zoo.entity.Habitat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitatRepository extends JpaRepository<Habitat, Integer> {

}
