package com.sakak.precourse;

import com.sakak.precourse.support.DBMigrationSupporter;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class ExcelMigrationRunner implements ApplicationRunner {

    private final DBMigrationSupporter migrationSupporter;

    public ExcelMigrationRunner(final DBMigrationSupporter migrationSupporter) {
        this.migrationSupporter = migrationSupporter;
    }

    @Override
    public void run(final ApplicationArguments args) {
        migrationSupporter.migrate();
    }
}
