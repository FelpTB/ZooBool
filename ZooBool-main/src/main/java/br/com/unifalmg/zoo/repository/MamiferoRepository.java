package br.com.unifalmg.zoo.repository;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MamiferoRepository extends JpaRepository<Animal.Mamifero, Integer> {
    // Adicione métodos específicos, se necessário
}
