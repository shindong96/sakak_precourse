package com.sakak.precourse.acceptance;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.support.DatabaseCleanUp;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(properties = "spring.session.store-type=none", webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NutritionAcceptanceTest {

    @LocalServerPort
    int port;

    @Autowired
    private DatabaseCleanUp databaseCleanUp;

    @Autowired
    private NutritionRepository nutritionRepository;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
        databaseCleanUp.execute();
    }

    @DisplayName("식품의 정보가 있을때, ")
    @Nested
    class SearchNutritionTest {
        String foodName = "꿩불고기";
        String researchYear = "2019";
        String makerName = "충주";
        String foodCode = "D000006";
        String groupName = "음식";
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
                    .dbGroup(groupName)
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

        @DisplayName("식품의 정보를 받아 해당 하는 정보를 검색하여 200으로 응답한다.")
        @Test
        void searchNutrition() {
            // given
            NutritionSearchingRequest searchingRequest = new NutritionSearchingRequest(foodName, researchYear,
                    makerName,
                    foodCode);
            // when
            ValidatableResponse response = get("/nutritions", searchingRequest);

            // then
            response.statusCode(200)
                    .body("id", notNullValue())
                    .body("food_cd", equalTo(foodCode))
                    .body("group_name", equalTo(groupName))
                    .body("food_name", equalTo(foodName))
                    .body("research_year", equalTo(researchYear))
                    .body("maker_name", equalTo(makerName))
                    .body("ref_name", equalTo(refName))
                    .body("serving_size", equalTo(servingSize))
                    .body("calorie", equalTo(calorie))
                    .body("carbohydrate", equalTo(carbohydrate))
                    .body("protein", equalTo(protein))
                    .body("province", equalTo(province))
                    .body("sugars", equalTo(sugars))
                    .body("salt", equalTo(salt))
                    .body("cholesterol", equalTo(cholesterol))
                    .body("saturated_fatty_acids", equalTo(saturatedFattyAcids))
                    .body("trans_fat", equalTo(transFat));
        }

    }

    private ValidatableResponse get(final String uri, final Object requestBody) {
        return RestAssured.given().log().all()
                .body(requestBody)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .when().get(uri)
                .then().log().all();
    }
}
