package com.sakak.precourse;

import com.sakak.precourse.domain.Nutrition;
import com.sakak.precourse.domain.NutritionRepository;
import com.sakak.precourse.support.DBMigrationSupporter;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class ExcelMigrationRunner implements ApplicationRunner {

    private final NutritionRepository repository;
    private final DBMigrationSupporter migrationSupporter;

    public ExcelMigrationRunner(final NutritionRepository nutritionRepository,
                                final DBMigrationSupporter migrationSupporter) {
        this.repository = nutritionRepository;
        this.migrationSupporter = migrationSupporter;
    }

    @Override
    public void run(final ApplicationArguments args) throws Exception {
        List<Nutrition> nutritions = migrationSupporter.migrate();
        repository.saveAll(nutritions);
    }
}
