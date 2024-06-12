package com.sakak.precourse.exception;

import lombok.Getter;

@Getter
public class NutritionNotFoundException extends RuntimeException {

    private static final String MESSAGE = "해당 id의 식품영양정보가 없습니다.";

    public NutritionNotFoundException() {
        super(MESSAGE);
    }
}
