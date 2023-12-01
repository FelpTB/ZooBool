package br.com.unifalmg.zoo.controller;

import br.com.unifalmg.zoo.entity.Animal;
import br.com.unifalmg.zoo.entity.Animal.*;
import br.com.unifalmg.zoo.entity.Funcionario;
import br.com.unifalmg.zoo.entity.Funcionario.*;
import br.com.unifalmg.zoo.entity.Manutencao;
import br.com.unifalmg.zoo.exception.FuncionarioNotFoundException;
import br.com.unifalmg.zoo.repository.*;
import br.com.unifalmg.zoo.service.AnimalService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@Controller
@AllArgsConstructor
public class ZooController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private TratadorRepository tratadorRepository;

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private ReptilRepository reptilRepository;

    @Autowired
    private MamiferoRepository mamiferoRepository;

    @Autowired
    private AlaRepository alaRepository;

    @Autowired
    private HabitatRepository habitatRepository;

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    @GetMapping("/funcionarios")
    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @GetMapping("/funcionarios/{id}")
    public Funcionario getFuncionarioById(@PathVariable Long id) {
        return funcionarioRepository.findById(id)
                .orElseThrow(() -> new FuncionarioNotFoundException(id));
    }

    @PostMapping("/funcionarios")
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @GetMapping("/tratadores")
    public List<Tratador> getAllTratadores() {
        return tratadorRepository.findAll();
    }

    @GetMapping("/veterinarios")
    public List<Veterinario> getAllVeterinarios() {
        return veterinarioRepository.findAll();
    }

    @GetMapping("/animais")
    public List<Animal> getAllAnimais() {
        return animalRepository.findAll();
    }

    @GetMapping("/repteis")
    public List<Reptil> getAllRepteis() {
        return reptilRepository.findAll();
    }

    @GetMapping("/mamiferos")
    public List<Mamifero> getAllMamiferos() {
        return mamiferoRepository.findAll();
    }


    @GetMapping("/manutencoes")
    public List<Manutencao> getAllManutencoes() {
        return manutencaoRepository.findAll();
    }
}