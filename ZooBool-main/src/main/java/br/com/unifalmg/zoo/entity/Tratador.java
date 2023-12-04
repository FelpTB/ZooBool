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
@Table(schema = "db2022108040", name = "Tratador")
public class Tratador implements Serializable {

    @Id
    private Integer IdTratador;

    private Integer IdFunc;

    private String TipoFunc;


    // TODO: Add a list of comments

}
