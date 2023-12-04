package br.com.unifalmg.zoo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "db2022108040", name = "Veterinario")
public class Veterinario implements Serializable {

    @Id
    private Integer IdVeterinario;

    private Integer IdFunc;

    private String TipoFunc;

    private String DiasDePlatao;

    private String Especialidade;


    // TODO: Add a list of comments
}