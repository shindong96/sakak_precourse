package com.sakak.precourse.application;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import com.sakak.precourse.support.DatabaseCleanUp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class NutritionServiceTest {

    @Autowired
    private NutritionService nutritionService;

    @Autowired
    private NutritionRepository nutritionRepository;

    @Autowired
    private DatabaseCleanUp databaseCleanUp;

    @BeforeEach
    void setUp() {
        databaseCleanUp.execute();
    }

    @DisplayName("식품영양성분 정보가 있을 때, ")
    @Nested
    class SearchingTest {

        String foodName = "꿩불고기";
        String researchYear = "2019";
        String makerName = "충주";
        String foodCode = "D000006";
        String no = "1";
        String groupName = "구이류";
        String refName = "외식영양성분자료집 통합본(2012-2017년)";
        String servingSize = "1";
        String calorie = "2";
        String carbohydrate = "3";
        String protein = "4";
        String province = "5";
        String sugars = "6";
        String salt = "7";
        String cholesterol = "8";
        String saturatedFattyAcids = "9";
        String transFat = "10";

        @BeforeEach
        void setUp() {
            nutritionRepository.save(Nutrition.builder()
                    .foodName(foodName)
                    .researchYear(researchYear)
                    .makerName(makerName)
                    .foodCode(foodCode)
                    .no(no)
                    .foodCategory(groupName)
                    .refName(refName)
                    .servingSize(servingSize)
                    .calorie(calorie)
                    .carbohydrate(carbohydrate)
                    .protein(protein)
                    .province(province)
                    .totalSugar(sugars)
                    .salt(salt)
                    .cholesterol(cholesterol)
                    .totalSaturatedFattyAcids(saturatedFattyAcids)
                    .transFat(transFat).build());
        }

        @DisplayName("해당되는 정보로 조회하면 정상 응답한다.")
        @Test
        void success() {
            // given
            NutritionSearchingRequest nutritionSearchingRequest = new NutritionSearchingRequest(foodName, researchYear,
                    makerName, foodCode);

            // when
            NutritionSearchingResponse response = nutritionService.search(nutritionSearchingRequest);

            // then
            NutritionSearchingResponse expected = NutritionSearchingResponse.builder()
                    .id(no)
                    .calorie(calorie)
                    .groupName(groupName)
                    .carbohydrate(carbohydrate)
                    .foodCd(foodCode)
                    .cholesterol(cholesterol)
                    .foodName(foodName)
                    .makerName(makerName)
                    .protein(protein)
                    .saturatedFattyAcids(saturatedFattyAcids)
                    .sugars(sugars)
                    .province(province)
                    .refName(refName)
                    .researchYear(researchYear)
                    .salt(salt)
                    .servingSize(servingSize)
                    .transFat(transFat)
                    .calorie(calorie)
                    .build();

            assertThat(response).usingRecursiveComparison()
                    .ignoringFields("id").isEqualTo(expected);
        }

        @DisplayName("적합한 정보가 없으면 예외를 발생한다.")
        @Test
        void fail_incorrect_request_info() {
            // given
            NutritionSearchingRequest nutritionSearchingRequest = new NutritionSearchingRequest(foodName, researchYear,
                    makerName, "wrong food code");

            // when & then
            assertThatThrownBy(() -> nutritionService.search(nutritionSearchingRequest))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessage("해당 정보의 식품이 없습니다.");
        }
    }
}
