package br.com.unifalmg.zoo.repository;


import br.com.unifalmg.zoo.entity.Funcionario;
import br.com.unifalmg.zoo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VeterinarioRepository extends JpaRepository<Funcionario.Veterinario, Integer> {
    // Adicione métodos específicos, se necessário
}