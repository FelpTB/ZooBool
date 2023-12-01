package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidAnimalException extends RuntimeException {

    public InvalidAnimalException(String message) {
        super(message);
    }

}
