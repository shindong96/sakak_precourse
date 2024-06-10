package com.sakak.precourse.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NutritionRepository extends JpaRepository<Nutrition, Long> {

    Optional<Nutrition> findByFoodCodeAndFoodNameAndResearchYearAndMakerName(String foodCode, String foodName,
                                                                             String researchYear, String makerName);

    @Modifying(flushAutomatically = true, clearAutomatically = true)
    @Query("delete from Nutrition n where n.id = :id")
    void deleteById(@Param("id") Long id);
}
