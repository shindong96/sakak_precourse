package com.sakak.precourse.support;

import com.sakak.precourse.domain.Nutrition;
import java.util.List;

public interface DBMigrationSupporter {

    public List<Nutrition> migrate();
}
