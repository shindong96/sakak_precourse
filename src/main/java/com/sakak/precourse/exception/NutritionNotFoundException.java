package com.sakak.precourse.exception;

public class NutritionNotFoundException extends SakakException {

    private static final String MESSAGE = "해당 id의 식품영양정보가 없습니다.";

    public NutritionNotFoundException() {
        super(MESSAGE);
    }
}
