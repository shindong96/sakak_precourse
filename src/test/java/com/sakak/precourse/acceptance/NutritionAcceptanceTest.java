package com.sakak.precourse.acceptance;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.dto.request.NutritionPersistRequest;
import com.sakak.precourse.dto.request.NutritionUpdatingRequest;
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
import org.springframework.http.HttpStatus;
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

    @DisplayName("식품의 정보를 저장하고 201을 응답한다.")
    @Test
    void save() {
        // given
        String component = "string";
        NutritionPersistRequest request = NutritionPersistRequest.builder()
                .sampleId(component)
                .foodCode(component)
                .dbGroup(component)
                .commercialProduct(component)
                .foodName(component)
                .researchYear(component)
                .makerName(component)
                .collectionTime(component)
                .foodCategory(component)
                .foodSubcategory(component)
                .servingSize(component)
                .contentUnit(component)
                .totalContentG(component)
                .totalContentMl(component)
                .calorie(component)
                .moisture(component)
                .protein(component)
                .province(component)
                .carbohydrate(component)
                .totalSugar(component)
                .sucrose(component)
                .glucose(component)
                .fructose(component)
                .lactose(component)
                .maltose(component)
                .totalDietaryFiber(component)
                .calcium(component)
                .iron(component)
                .ironMicrograms(component)
                .magnesium(component)
                .phosphorus(component)
                .potassium(component)
                .salt(component)
                .zinc(component)
                .copper(component)
                .manganese(component)
                .selenium(component)
                .retinol(component)
                .betaCarotene(component)
                .vitaminD3(component)
                .tocopherol(component)
                .tocotrienol(component)
                .vitaminB1(component)
                .vitaminB2(component)
                .niacin(component)
                .folateDfe(component)
                .vitaminB12(component)
                .vitaminC(component)
                .totalAminoAcids(component)
                .isoleucine(component)
                .leucine(component)
                .lysine(component)
                .methionine(component)
                .phenylalanine(component)
                .threonine(component)
                .valine(component)
                .histidine(component)
                .arginine(component)
                .tyrosine(component)
                .cysteine(component)
                .alanine(component)
                .asparticAcid(component)
                .glutamicAcid(component)
                .glycine(component)
                .proline(component)
                .serine(component)
                .cholesterol(component)
                .totalSaturatedFattyAcids(component)
                .butyricAcid(component)
                .caproicAcid(component)
                .caprylicAcid(component)
                .capricAcid(component)
                .lauricAcid(component)
                .myristicAcid(component)
                .palmiticAcid(component)
                .stearicAcid(component)
                .arachidicAcid(component)
                .myristoleicAcid(component)
                .palmitoleicAcid(component)
                .oleicAcid(component)
                .vaccenicAcid(component)
                .gadoleicAcid(component)
                .linoleicAcid(component)
                .alphaLinolenicAcid(component)
                .gammaLinolenicAcid(component)
                .eicosadienoicAcid(component)
                .arachidonicAcid(component)
                .eicosatrienoicAcid(component)
                .eicosapentaenoicAcid(component)
                .docosapentaenoicAcid(component)
                .docosahexaenoicAcid(component)
                .transFat(component)
                .transOleicAcid(component)
                .transLinoleicAcid(component)
                .transLinolenicAcid(component)
                .ash(component)
                .caffeine(component)
                .refName(component)
                .publishingOrganization(component).build();

        // when
        ValidatableResponse response = post("/nutritions", request);

        // then
        response.statusCode(HttpStatus.CREATED.value())
                .header("Location", notNullValue());
    }

    @DisplayName("식품영양정보의 id를 통해 정보를 삭제하고 204를 반환한다.")
    @Test
    void delete() {
        // given
        Nutrition nutrition = nutritionRepository.save(Nutrition.builder().build());

        // when
        Long id = nutrition.getId();
        ValidatableResponse response = delete("/nutritions/" + id.intValue());

        // then
        response.statusCode(204);
    }

    @DisplayName("식품의 정보가 있을때, ")
    @Nested
    class SearchNutritionInfoTest {
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
        Long nutritionId;

        @BeforeEach
        void setUp() {
            Nutrition savednutrition = nutritionRepository.save(Nutrition.builder()
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

            nutritionId = savednutrition.getId();
        }

        @DisplayName("식품의 정보를 받아 해당 하는 간단 영양 정보를 검색하여 200으로 응답한다.")
        @Test
        void searchForSimpleNutritionInfo() {
            // given
            String uri = "/nutritions/simplification?" + "food_name=" + foodName + "&research_year=" + researchYear
                    + "&maker_name=" + makerName + "&food_code=" + foodCode;

            // when
            ValidatableResponse response = get(uri);

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

        @DisplayName("식품영양정보의 식별자를 받아 해당 식품영양정보를 200으로 응답한다.")
        @Test
        void findById() {
            // given
            int id = nutritionId.intValue();

            // when
            ValidatableResponse response = get("/nutritions/" + id);

            // then
            response.statusCode(200)
                    .body("id", equalTo(id));
        }

        @DisplayName("식품명을 변경할 경우 204로 응답한다.")
        @Test
        void updateFoodName() {
            // given
            String changedFoodName = "바뀐 식품명";
            NutritionUpdatingRequest request = NutritionUpdatingRequest.builder()
                    .foodName(changedFoodName)
                    .build();

            // when
            ValidatableResponse response = patch("/nutritions/" + nutritionId.intValue(), request);

            // then
            response.statusCode(200)
                    .body("food_name", equalTo(changedFoodName));
        }
    }

    private ValidatableResponse post(final String uri, final Object requestBody) {
        return RestAssured.given().log().all()
                .body(requestBody)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .when().post(uri)
                .then().log().all();
    }

    private ValidatableResponse get(final String uri) {
        return RestAssured.given().log().all()
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .when().get(uri)
                .then().log().all();
    }

    private ValidatableResponse patch(final String uri, final Object requestBody) {
        return RestAssured.given().log().all()
                .body(requestBody)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE)
                .when().patch(uri)
                .then().log().all();
    }

    private ValidatableResponse delete(final String uri) {
        return RestAssured.given().log().all()
                .when().delete(uri)
                .then().log().all();
    }
}
