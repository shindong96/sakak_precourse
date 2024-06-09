package com.sakak.precourse.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
public class NutritionSearchingResponse {
    private final String id;
    private final String foodCd;
    private final String groupName;
    private final String foodName;
    private final String researchYear;
    private final String makerName;
    private final String refName;
    private final String servingSize;
    private final String calorie;
    private final String carbohydrate;
    private final String protein;
    private final String province;
    private final String sugars;
    private final String salt;
    private final String cholesterol;
    private final String saturatedFattyAcids;
    private final String transFat;
}
