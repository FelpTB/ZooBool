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
@Table(schema = "db2022108040", name = "Manutencao")
public class Manutencao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IdAla;

    private Integer IdZelador;


    @ManyToOne
    @JoinColumn(name = "Zelador")
    private Zelador zelador;

    @ManyToOne
    @JoinColumn(name = "Ala")
    private Ala ala;

}