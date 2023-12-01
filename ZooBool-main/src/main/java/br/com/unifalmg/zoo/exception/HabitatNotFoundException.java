package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HabitatNotFoundException extends RuntimeException {

    public HabitatNotFoundException(String message) {
        super(message);
    }

}
