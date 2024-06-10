package com.sakak.precourse.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sakak.precourse.domain.Nutrition;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Builder
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

    public static NutritionSearchingResponse from(final Nutrition nutrition) {
        return NutritionSearchingResponse.builder()
                .id(String.valueOf(nutrition.getId()))
                .foodCd(nutrition.getFoodCode())
                .groupName(nutrition.getDbGroup())
                .foodName(nutrition.getFoodName())
                .researchYear(nutrition.getResearchYear())
                .makerName(nutrition.getMakerName())
                .refName(nutrition.getRefName())
                .servingSize(nutrition.getServingSize())
                .calorie(nutrition.getCalorie())
                .carbohydrate(nutrition.getCarbohydrate())
                .protein(nutrition.getProtein())
                .province(nutrition.getProvince())
                .sugars(nutrition.getTotalSugar())
                .salt(nutrition.getSalt())
                .cholesterol(nutrition.getCholesterol())
                .saturatedFattyAcids(nutrition.getTotalSaturatedFattyAcids())
                .transFat(nutrition.getTransFat())
                .build();
    }
}
