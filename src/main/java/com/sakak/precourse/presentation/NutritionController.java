package com.sakak.precourse.presentation;

import com.sakak.precourse.application.NutritionService;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NutritionController {

    private final NutritionService nutritionService;

    @GetMapping("/nutritions")
    public ResponseEntity<NutritionSearchingResponse> search(@RequestBody NutritionSearchingRequest request) {
        NutritionSearchingResponse response = nutritionService.search(request);
        return ResponseEntity.ok(response);
    }
}
