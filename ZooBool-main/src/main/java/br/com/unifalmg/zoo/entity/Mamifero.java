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
@Table(schema = "db2022108040", name = "Mamifero")
public class Mamifero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String TempoAmam;

    private String TempoGestacao;

}
