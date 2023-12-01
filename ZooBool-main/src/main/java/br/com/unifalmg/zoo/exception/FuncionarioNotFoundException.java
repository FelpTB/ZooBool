package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FuncionarioNotFoundException extends RuntimeException {

    public FuncionarioNotFoundException(String message) {
        super("Funcionário não encontrado");
    }

}
