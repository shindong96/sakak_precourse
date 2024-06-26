package com.sakak.precourse.application;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.dto.request.NutritionPersistRequest;
import com.sakak.precourse.dto.request.NutritionSearchingRequest;
import com.sakak.precourse.dto.request.NutritionUpdatingRequest;
import com.sakak.precourse.dto.response.NutritionSearchingResponse;
import com.sakak.precourse.dto.response.SpecificNutritionResponse;
import com.sakak.precourse.exception.NutritionNotFoundException;
import com.sakak.precourse.exception.SearchingNutritionFailureException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class NutritionService {

    private final NutritionRepository nutritionRepository;

    public Long save(final NutritionPersistRequest request) {
        Nutrition nutrition = request.toDomain();
        Nutrition savedNutrition = nutritionRepository.save(nutrition);
        return savedNutrition.getId();
    }

    @Transactional(readOnly = true)
    public NutritionSearchingResponse searchForSimpleInfo(final NutritionSearchingRequest request) {
        Nutrition nutrition = nutritionRepository
                .findByFoodCodeAndFoodNameAndResearchYearAndMakerName(request.getFoodCode(), request.getFoodName(),
                        request.getResearchYear(), request.getMakerName())
                .orElseThrow(SearchingNutritionFailureException::new);
        return NutritionSearchingResponse.from(nutrition);
    }

    @Transactional(readOnly = true)
    public SpecificNutritionResponse findById(final Long id) {
        Nutrition nutrition = nutritionRepository.findById(id)
                .orElseThrow(NutritionNotFoundException::new);
        return SpecificNutritionResponse.from(nutrition);
    }

    public SpecificNutritionResponse updateById(final Long id, final NutritionUpdatingRequest request) {
        Nutrition nutrition = nutritionRepository.findById(id)
                .orElseThrow(NutritionNotFoundException::new);

        Nutrition updatingNutritionInfo = request.toDomain();
        nutrition.update(updatingNutritionInfo);

        return SpecificNutritionResponse.from(nutrition);
    }

    public void delete(final Long id) {
        nutritionRepository.deleteById(id);
    }
}
