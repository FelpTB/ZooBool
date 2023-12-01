package br.com.unifalmg.zoo.repository;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
