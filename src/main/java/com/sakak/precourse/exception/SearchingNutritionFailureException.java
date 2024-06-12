package com.sakak.precourse.exception;

public class SearchingNutritionFailureException extends SakakException {

    private static final String MESSAGE = "해당 정보의 식품이 없습니다.";

    public SearchingNutritionFailureException() {
        super(MESSAGE);
    }
}
