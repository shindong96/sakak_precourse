package com.sakak.precourse.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NutritionTest {

    @DisplayName("update시 특정 변수만 정확히 바뀌는지 테스트한다.")
    @Test
    void update() {
        // given
        String sampleId = "1234";
        String updatedFoodName = "food";
        Nutrition nutrition = Nutrition.builder()
                .sampleId(sampleId)
                .build();
        Nutrition updatedInfo = Nutrition.builder()
                .foodName(updatedFoodName)
                .build();

        // when
        nutrition.update(updatedInfo);

        // then
        assertAll(
                () -> assertThat(nutrition.getSampleId()).isEqualTo(sampleId),
                () -> assertThat(nutrition.getFoodName()).isEqualTo(updatedFoodName)
        );
    }
}
