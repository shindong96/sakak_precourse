package com.sakak.precourse.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionRepository extends JpaRepository<Nutrition, Long> {
    Optional<Nutrition> findByFoodCodeAndFoodNameAndResearchYearAndMakerName(String foodCode, String foodName,
                                                                             String researchYear, String makerName);
}
