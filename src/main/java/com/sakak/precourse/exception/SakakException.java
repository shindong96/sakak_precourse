package com.sakak.precourse.exception;

import lombok.Getter;

@Getter
public class SakakException extends RuntimeException {

    public SakakException(final String message) {
        super(message);
    }
}
