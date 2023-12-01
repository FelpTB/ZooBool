package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AnimalNotFoundException extends RuntimeException {

    public AnimalNotFoundException(String message) {
        super(message);
    }

}
