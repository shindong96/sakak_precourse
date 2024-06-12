package com.sakak.precourse.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NutritionSearchingRequest {

    @NotBlank(message = "식품명은 공백일 수 없습니다.")
    private String food_name;

    @NotBlank(message = "조사연도는 공백일 수 없습니다.")
    private String research_year;

    @NotBlank(message = "지역/제조사는 공백일 수 없습니다.")
    private String maker_name;

    @NotBlank(message = "식품코드는 공백일 수 없습니다.")
    private String food_code;

    public String getFoodName() {
        return food_name;
    }

    public String getResearchYear() {
        return research_year;
    }

    public String getMakerName() {
        return maker_name;
    }

    public String getFoodCode() {
        return food_code;
    }
}
