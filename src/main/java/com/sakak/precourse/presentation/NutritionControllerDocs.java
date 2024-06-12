package com.sakak.precourse.presentation;

import com.sakak.precourse.dto.request.NutritionPersistRequest;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import com.sakak.precourse.dto.response.SpecificNutritionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "식품영양정보")
public interface NutritionControllerDocs {

    @Operation(summary = "식품영양정보 추가")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "201", description = "성공")
            })
    ResponseEntity<Void> save(@RequestBody NutritionPersistRequest request);

    @Operation(summary = "식품영양정보 간단 정보 검색")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "성공"),
                    @ApiResponse(responseCode = "400", description = "실패", content = @Content(
                            examples = {@ExampleObject(name = "요청 인자가 부족한 경우", value = """
                                    {
                                        "message" : "~은 공백일 수 없습니다."
                                    }
                                    """)
                                    , @ExampleObject(name = "입력받은 정보로 검색한 결과가 없는 경우", value = """
                                    {
                                        "message" : "해당 정보의 식품이 없습니다."
                                    }
                                    """)
                            }))})
    ResponseEntity<NutritionSearchingResponse> searchForSimpleInfo(
            @RequestBody @Valid NutritionSearchingRequest request);

    @Operation(summary = "식품영양정보 조회")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "성공"),
                    @ApiResponse(responseCode = "404", description = "실패", content = @Content(
                            examples = {@ExampleObject(name = "해당 식별자의 데이터가 없는 경우", value = """
                                    {
                                        "message" : "해당 id의 식품영양정보가 없습니다."
                                    }
                                    """)
                            }))
            })
    ResponseEntity<SpecificNutritionResponse> findById(@PathVariable Long id);


    @Operation(summary = "식품영양정보 삭제")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "204", description = "성공")
            })
    ResponseEntity<Void> delete(@PathVariable Long id);
}
