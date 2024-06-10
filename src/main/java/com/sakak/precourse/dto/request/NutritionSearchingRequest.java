package com.sakak.precourse.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NutritionSearchingRequest {

    @NotBlank(message = "식품명은 공백일 수 없습니다.")
    private String foodName;

    @NotBlank(message = "조사연도는 공백일 수 없습니다.")
    private String researchYear;

    @NotBlank(message = "지역/제조사는 공백일 수 없습니다.")
    private String makerName;

    @NotBlank(message = "식품코드는 공백일 수 없습니다.")
    private String foodCode;
}
