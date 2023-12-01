package br.com.unifalmg.zoo.service;

import br.com.unifalmg.zoo.entity.Funcionario;
import br.com.unifalmg.zoo.exception.FuncionarioNotFoundException;
import br.com.unifalmg.zoo.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public List<Funcionario> getAllFuncionarios() {
        return repository.findAll();
    }

    public Funcionario findById(Integer id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Id null when fetching for an animal.");
        }
        return repository.findById(id).orElseThrow(() ->

                new FuncionarioNotFoundException(String.format("No funcionario found for id %d", id))
        );
    }


}
