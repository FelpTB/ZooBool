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
@Table(schema = "db", name = "Funcionario")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdFunc;

    private String Pnome;

    private String Snome;

    private String CPF;

    private String Telefone;

    private Float Salario;

    private Integer HorasTrabalho;

    @Entity
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(schema = "db", name = "Tratador")
    public class Tratador extends Funcionario {

        @Id
        private Integer IdTratador;

        private Integer IdFunc;

        private String TipoFunc;


        // TODO: Add a list of comments

    }

    @Entity
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(schema = "db", name = "Veterinario")
    public class Veterinario extends Funcionario {

        @Id
        private Integer IdVeterinario;

        private Integer IdFunc;

        private String TipoFunc;

        private String DiasDePlatao;

        private String Especialidade;


        // TODO: Add a list of comments
    }

    @Entity
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Table(schema = "db2022108040", name = "Zelador")
    public class Zelador implements Serializable {

        @Id
        private Integer IdZelador;

        private Integer IdFunc;

        private String TipoFunc;


        // TODO: Add a list of comments

    }


}