package br.com.unifalmg.zoo.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidHabitatException extends RuntimeException {

    public InvalidHabitatException(String message) {
        super(message);
    }

}
