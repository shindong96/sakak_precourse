package com.sakak.precourse.application;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class NutritionService {

    private final NutritionRepository nutritionRepository;

    @Transactional(readOnly = true)
    public NutritionSearchingResponse search(final NutritionSearchingRequest request) {
        Nutrition nutrition = nutritionRepository
                .findByFoodCodeAndFoodNameAndResearchYearAndMakerName(request.getFoodCode(), request.getFoodName(),
                        request.getResearchYear(), request.getMakerName())
                .orElseThrow(() -> new IllegalArgumentException("해당 정보의 식품이 없습니다."));
        return NutritionSearchingResponse.from(nutrition);
    }
}