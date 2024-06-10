package com.sakak.precourse.exception;

import lombok.Getter;

@Getter
public class NutritionNotFoundException extends IllegalArgumentException {

    public NutritionNotFoundException(final String message) {
        super(message);
    }
}
