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



}
