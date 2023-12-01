package br.com.unifalmg.zoo.repository;


import br.com.unifalmg.zoo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TratadorRepository extends JpaRepository<Funcionario.Tratador, Integer> {
    // Adicione métodos específicos, se necessário
}