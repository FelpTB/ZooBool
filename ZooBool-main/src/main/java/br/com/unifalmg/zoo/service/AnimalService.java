package br.com.unifalmg.zoo.service;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.exception.InvalidAnimalException;
import br.com.unifalmg.zoo.exception.AnimalNotFoundException;
import br.com.unifalmg.zoo.repository.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class AnimalService {

    private final AnimalRepository repository;

    public List<Animal> getAllAnimals() {
        return repository.findAll();
    }

    public Animal findById(Integer id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Id null when fetching for an animal.");
        }
        return repository.findById(id).orElseThrow(() ->
                    new AnimalNotFoundException(
                            String.format("No animal found for id %d", id))
                );
    }

    public Animal add(Animal animal) {
        if (Objects.isNull(animal) || Objects.isNull(animal.getNome())
                || Objects.isNull(animal.getIdade()) || Objects.isNull(animal.getTamanho())
                || Objects.isNull(animal.getIdAnimal()) || Objects.isNull(animal.getEspecie())
                || Objects.isNull(animal.getNCientifico())|| Objects.isNull(animal.getPeso())
                || Objects.isNull(animal.getIdVet()) || Objects.isNull(animal.getIdHabitat()) ) {
            throw new InvalidAnimalException();
        }
        return repository.save(animal);
    }

}
