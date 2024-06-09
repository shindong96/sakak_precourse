package com.sakak.precourse;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.support.ExcelReader;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class ExcelMigrationRunner implements ApplicationRunner {

    private final NutritionRepository repository;
    private final ExcelReader excelReader;
    private final String excelPath;

    public ExcelMigrationRunner(final NutritionRepository nutritionRepository,
                                final ExcelReader excelReader,
                                @Value("${excel.path}") final String excelPath) {
        this.repository = nutritionRepository;
        this.excelReader = excelReader;
        this.excelPath = excelPath;
    }

    @Override
    public void run(final ApplicationArguments args) throws Exception {
        List<Nutrition> nutritions = excelReader.exportNutritionInfo(excelPath);
        repository.saveAll(nutritions);
    }
}
