package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidFuncionarioException extends RuntimeException {

    public InvalidFuncionarioException(String message) {
        super(message);
    }

}
