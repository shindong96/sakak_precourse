package com.sakak.precourse.exception;

import lombok.Getter;

@Getter
public class SearchingNutritionFailureException extends IllegalArgumentException {

    public SearchingNutritionFailureException(final String message) {
        super(message);
    }
}
