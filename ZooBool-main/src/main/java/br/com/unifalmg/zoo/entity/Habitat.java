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
@Table(schema = "db2022108040", name = "Habitat")
public class Habitat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdHabitat;

    private Integer IdTratador;

    private Integer IdAla;

    private String Tipo;

    private Integer NEspecies;

    private String HorarioTrat;


    @ManyToOne
    @JoinColumn(name= "AlaId")
    private Ala ala;




}