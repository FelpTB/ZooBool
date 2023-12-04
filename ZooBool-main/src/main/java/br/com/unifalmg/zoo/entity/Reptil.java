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
@Table(schema = "db2022108040", name = "Reptil")
public class Reptil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String TempCorporal;

    private String TempoIncubacao;

}
