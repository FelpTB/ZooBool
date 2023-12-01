package br.com.unifalmg.zoo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "db2022108040", name = "Animal")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAnimal;

    private String Nome;

    private String NCientifico;

    private String Tamanho;

    private String Especie;

    private Integer IdHabitat;

    private Integer IdVet;

    private Integer Idade;

    private Float Peso;

    @ManyToOne
    @JoinColumn (name = "IdHabitat")
    private Habitat habitat;

    @ManyToOne
    @JoinColumn(name = "idVet")
    private Funcionario.Veterinario veterinario;
    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(schema = "db", name = "Reptil")

    @Entity
    @PrimaryKeyJoinColumn(name = "idAnimal")
    public class Reptil extends Animal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private String TempCorporal;

        private String TempoIncubacao;

    }

    @Setter
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(schema = "db", name = "Mamifero")

    @Entity
    @PrimaryKeyJoinColumn(name = "idAnimal")
    public class Mamifero extends Animal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private String TempoAmam;

        private String TempoGestacao;

    }




}
