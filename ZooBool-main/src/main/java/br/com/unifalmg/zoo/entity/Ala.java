package br.com.unifalmg.zoo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "db2022108040", name = "Ala")
public class Ala implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IdAla;

    private String Tamanho;

    @OneToMany(mappedBy = "Ala")
    private List<Habitat> habitats;

}