package br.com.unifalmg.zoo.service;

import br.com.unifalmg.zoo.entity.Habitat;
import br.com.unifalmg.zoo.exception.HabitatNotFoundException;
import br.com.unifalmg.zoo.exception.InvalidHabitatException;
import br.com.unifalmg.zoo.repository.HabitatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class HabitatService {

    private final HabitatRepository repository;

    public List<Habitat> getAllUsers() {
        return repository.findAll();
    }

    public Habitat findById(Integer id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Id null when fetching for an animal.");
        }
        return repository.findById(id).orElseThrow(() ->
                    new HabitatNotFoundException(
                            String.format("No animal found for id %d", id))
                );
    }

    public Habitat add(Habitat habitat) {
        if (Objects.isNull(habitat) || Objects.isNull(habitat.getIdHabitat())
                || Objects.isNull(habitat.getAla()) || Objects.isNull(habitat.getIdAla())
                || Objects.isNull(habitat.getTipo()) || Objects.isNull(habitat.getNEspecies())
                || Objects.isNull(habitat.getHorarioTrat())|| Objects.isNull(habitat.getIdTratador())) {
            throw new InvalidHabitatException();
        }
        return repository.save(habitat);
    }

}
