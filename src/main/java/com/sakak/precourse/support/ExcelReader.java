package com.sakak.precourse.support;

import com.sakak.precourse.domain.Nutrition;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
public class ExcelReader implements DBMigrationSupporter {

    private final JdbcTemplate jdbcTemplate;
    private final String excelFilePath;
    private final Integer batchSizeMax;

    public ExcelReader(final JdbcTemplate jdbcTemplate,
                       @Value("${excel.path}") final String excelFilePath,
                       @Value("${spring.jpa.properties.hibernate.jdbc.batch_size}") final Integer batchSizeMax) {
        this.jdbcTemplate = jdbcTemplate;
        this.excelFilePath = excelFilePath;
        this.batchSizeMax = batchSizeMax;
    }

    @Transactional
    public void migrate() {
        List<Nutrition> dataList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                Nutrition data = castToNutrition(row);
                dataList.add(data);

                if (dataList.size() == batchSizeMax) {
                    insertBatch(dataList);
                    dataList.clear();
                }
            }

            if (!dataList.isEmpty()) {
                insertBatch(dataList);
            }
        } catch (IOException e) {
            System.err.println("Excel 파일을 읽어오는데 실패했습니다!");
        }
    }

    private Nutrition castToNutrition(final Row row) {
        return Nutrition.builder()
                .sampleId(getStringCellValue(row.getCell(1)))
                .foodCode(getStringCellValue(row.getCell(2)))
                .dbGroup(getStringCellValue(row.getCell(3)))
                .commercialProduct(getStringCellValue(row.getCell(4)))
                .foodName(getStringCellValue(row.getCell(5)))
                .researchYear(getStringCellValue(row.getCell(6)))
                .makerName(getStringCellValue(row.getCell(7)))
                .collectionTime(getStringCellValue(row.getCell(8)))
                .foodCategory(getStringCellValue(row.getCell(9)))
                .foodSubcategory(getStringCellValue(row.getCell(10)))
                .servingSize(getStringCellValue(row.getCell(11)))
                .contentUnit(getStringCellValue(row.getCell(12)))
                .totalContentG(getStringCellValue(row.getCell(13)))
                .totalContentMl(getStringCellValue(row.getCell(14)))
                .calorie(getStringCellValue(row.getCell(15)))
                .moisture(getStringCellValue(row.getCell(16)))
                .protein(getStringCellValue(row.getCell(17)))
                .province(getStringCellValue(row.getCell(18)))
                .carbohydrate(getStringCellValue(row.getCell(19)))
                .totalSugar(getStringCellValue(row.getCell(20)))
                .sucrose(getStringCellValue(row.getCell(21)))
                .glucose(getStringCellValue(row.getCell(22)))
                .fructose(getStringCellValue(row.getCell(23)))
                .lactose(getStringCellValue(row.getCell(24)))
                .maltose(getStringCellValue(row.getCell(25)))
                .totalDietaryFiber(getStringCellValue(row.getCell(26)))
                .calcium(getStringCellValue(row.getCell(27)))
                .iron(getStringCellValue(row.getCell(28)))
                .ironMicrograms(getStringCellValue(row.getCell(29)))
                .magnesium(getStringCellValue(row.getCell(30)))
                .phosphorus(getStringCellValue(row.getCell(31)))
                .potassium(getStringCellValue(row.getCell(32)))
                .salt(getStringCellValue(row.getCell(33)))
                .zinc(getStringCellValue(row.getCell(34)))
                .copper(getStringCellValue(row.getCell(35)))
                .manganese(getStringCellValue(row.getCell(36)))
                .selenium(getStringCellValue(row.getCell(37)))
                .retinol(getStringCellValue(row.getCell(38)))
                .betaCarotene(getStringCellValue(row.getCell(39)))
                .vitaminD3(getStringCellValue(row.getCell(40)))
                .tocopherol(getStringCellValue(row.getCell(41)))
                .tocotrienol(getStringCellValue(row.getCell(42)))
                .vitaminB1(getStringCellValue(row.getCell(43)))
                .vitaminB2(getStringCellValue(row.getCell(44)))
                .niacin(getStringCellValue(row.getCell(45)))
                .folateDfe(getStringCellValue(row.getCell(46)))
                .vitaminB12(getStringCellValue(row.getCell(47)))
                .vitaminC(getStringCellValue(row.getCell(48)))
                .totalAminoAcids(getStringCellValue(row.getCell(49)))
                .isoleucine(getStringCellValue(row.getCell(50)))
                .leucine(getStringCellValue(row.getCell(51)))
                .lysine(getStringCellValue(row.getCell(52)))
                .methionine(getStringCellValue(row.getCell(53)))
                .phenylalanine(getStringCellValue(row.getCell(54)))
                .threonine(getStringCellValue(row.getCell(55)))
                .valine(getStringCellValue(row.getCell(56)))
                .histidine(getStringCellValue(row.getCell(57)))
                .arginine(getStringCellValue(row.getCell(58)))
                .tyrosine(getStringCellValue(row.getCell(59)))
                .cysteine(getStringCellValue(row.getCell(60)))
                .alanine(getStringCellValue(row.getCell(61)))
                .asparticAcid(getStringCellValue(row.getCell(62)))
                .glutamicAcid(getStringCellValue(row.getCell(63)))
                .glycine(getStringCellValue(row.getCell(64)))
                .proline(getStringCellValue(row.getCell(65)))
                .serine(getStringCellValue(row.getCell(66)))
                .cholesterol(getStringCellValue(row.getCell(67)))
                .totalSaturatedFattyAcids(getStringCellValue(row.getCell(68)))
                .butyricAcid(getStringCellValue(row.getCell(69)))
                .caproicAcid(getStringCellValue(row.getCell(70)))
                .caprylicAcid(getStringCellValue(row.getCell(71)))
                .capricAcid(getStringCellValue(row.getCell(72)))
                .lauricAcid(getStringCellValue(row.getCell(73)))
                .myristicAcid(getStringCellValue(row.getCell(74)))
                .palmiticAcid(getStringCellValue(row.getCell(75)))
                .stearicAcid(getStringCellValue(row.getCell(76)))
                .arachidicAcid(getStringCellValue(row.getCell(77)))
                .myristoleicAcid(getStringCellValue(row.getCell(78)))
                .palmitoleicAcid(getStringCellValue(row.getCell(79)))
                .oleicAcid(getStringCellValue(row.getCell(80)))
                .vaccenicAcid(getStringCellValue(row.getCell(81)))
                .gadoleicAcid(getStringCellValue(row.getCell(82)))
                .linoleicAcid(getStringCellValue(row.getCell(83)))
                .alphaLinolenicAcid(getStringCellValue(row.getCell(84)))
                .gammaLinolenicAcid(getStringCellValue(row.getCell(85)))
                .eicosadienoicAcid(getStringCellValue(row.getCell(86)))
                .arachidonicAcid(getStringCellValue(row.getCell(87)))
                .eicosatrienoicAcid(getStringCellValue(row.getCell(88)))
                .eicosapentaenoicAcid(getStringCellValue(row.getCell(89)))
                .docosapentaenoicAcid(getStringCellValue(row.getCell(90)))
                .docosahexaenoicAcid(getStringCellValue(row.getCell(91)))
                .transFat(getStringCellValue(row.getCell(92)))
                .transOleicAcid(getStringCellValue(row.getCell(93)))
                .transLinoleicAcid(getStringCellValue(row.getCell(94)))
                .transLinolenicAcid(getStringCellValue(row.getCell(95)))
                .ash(getStringCellValue(row.getCell(96)))
                .caffeine(getStringCellValue(row.getCell(97)))
                .refName(getStringCellValue(row.getCell(98)))
                .publishingOrganization(getStringCellValue(row.getCell(99)))
                .build();
    }

    private void insertBatch(final List<Nutrition> dataList) {
        String sql = "INSERT INTO nutrition (sample_id, food_code, db_group, commercial_product, food_name, "
                + "research_year, maker_name, collection_time, food_category, food_subcategory, serving_size, "
                + "content_unit, total_content_g, total_content_ml, calorie, moisture, protein, province, carbohydrate, "
                + "total_sugar, sucrose, glucose, fructose, lactose, maltose, total_dietary_fiber, calcium, iron, "
                + "iron_micrograms, magnesium, phosphorus, potassium, salt, zinc, copper, manganese, selenium, "
                + "retinol, beta_carotene, vitamin_d3, tocopherol, tocotrienol, vitamin_b1, vitamin_b2, niacin, folate_dfe, "
                + "vitamin_b12, vitamin_c, total_amino_acids, isoleucine, leucine, lysine, methionine, phenylalanine, "
                + "threonine, valine, histidine, arginine, tyrosine, cysteine, alanine, aspartic_acid, glutamic_acid, "
                + "glycine, proline, serine, cholesterol, total_saturated_fatty_acids, butyric_acid, caproic_acid, "
                + "caprylic_acid, capric_acid, lauric_acid, myristic_acid, palmitic_acid, stearic_acid, arachidic_acid, "
                + "myristoleic_acid, palmitoleic_acid, oleic_acid, vaccenic_acid, gadoleic_acid, linoleic_acid, "
                + "alpha_linolenic_acid, gamma_linolenic_acid, eicosadienoic_acid, arachidonic_acid, "
                + "eicosatrienoic_acid, eicosapentaenoic_acid, docosapentaenoic_acid, docosahexaenoic_acid, trans_fat, trans_oleic_acid, "
                + "trans_linoleic_acid, trans_linolenic_acid, ash, caffeine, ref_name, publishing_organization) "
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Nutrition data = dataList.get(i);
                ps.setString(1, data.getSampleId());
                ps.setString(2, data.getFoodCode());
                ps.setString(3, data.getDbGroup());
                ps.setString(4, data.getCommercialProduct());
                ps.setString(5, data.getFoodName());
                ps.setString(6, data.getResearchYear());
                ps.setString(7, data.getMakerName());
                ps.setString(8, data.getCollectionTime());
                ps.setString(9, data.getFoodCategory());
                ps.setString(10, data.getFoodSubcategory());
                ps.setString(11, data.getServingSize());
                ps.setString(12, data.getContentUnit());
                ps.setString(13, data.getTotalContentG());
                ps.setString(14, data.getTotalContentMl());
                ps.setString(15, data.getCalorie());
                ps.setString(16, data.getMoisture());
                ps.setString(17, data.getProtein());
                ps.setString(18, data.getProvince());
                ps.setString(19, data.getCarbohydrate());
                ps.setString(20, data.getTotalSugar());
                ps.setString(21, data.getSucrose());
                ps.setString(22, data.getGlucose());
                ps.setString(23, data.getFructose());
                ps.setString(24, data.getLactose());
                ps.setString(25, data.getMaltose());
                ps.setString(26, data.getTotalDietaryFiber());
                ps.setString(27, data.getCalcium());
                ps.setString(28, data.getIron());
                ps.setString(29, data.getIronMicrograms());
                ps.setString(30, data.getMagnesium());
                ps.setString(31, data.getPhosphorus());
                ps.setString(32, data.getPotassium());
                ps.setString(33, data.getSalt());
                ps.setString(34, data.getZinc());
                ps.setString(35, data.getCopper());
                ps.setString(36, data.getManganese());
                ps.setString(37, data.getSelenium());
                ps.setString(38, data.getRetinol());
                ps.setString(39, data.getBetaCarotene());
                ps.setString(40, data.getVitaminD3());
                ps.setString(41, data.getTocopherol());
                ps.setString(42, data.getTocotrienol());
                ps.setString(43, data.getVitaminB1());
                ps.setString(44, data.getVitaminB2());
                ps.setString(45, data.getNiacin());
                ps.setString(46, data.getFolateDfe());
                ps.setString(47, data.getVitaminB12());
                ps.setString(48, data.getVitaminC());
                ps.setString(49, data.getTotalAminoAcids());
                ps.setString(50, data.getIsoleucine());
                ps.setString(51, data.getLeucine());
                ps.setString(52, data.getLysine());
                ps.setString(53, data.getMethionine());
                ps.setString(54, data.getPhenylalanine());
                ps.setString(55, data.getThreonine());
                ps.setString(56, data.getValine());
                ps.setString(57, data.getHistidine());
                ps.setString(58, data.getArginine());
                ps.setString(59, data.getTyrosine());
                ps.setString(60, data.getCysteine());
                ps.setString(61, data.getAlanine());
                ps.setString(62, data.getAsparticAcid());
                ps.setString(63, data.getGlutamicAcid());
                ps.setString(64, data.getGlycine());
                ps.setString(65, data.getProline());
                ps.setString(66, data.getSerine());
                ps.setString(67, data.getCholesterol());
                ps.setString(68, data.getTotalSaturatedFattyAcids());
                ps.setString(69, data.getButyricAcid());
                ps.setString(70, data.getCaproicAcid());
                ps.setString(71, data.getCaprylicAcid());
                ps.setString(72, data.getCapricAcid());
                ps.setString(73, data.getLauricAcid());
                ps.setString(74, data.getMyristicAcid());
                ps.setString(75, data.getPalmiticAcid());
                ps.setString(76, data.getStearicAcid());
                ps.setString(77, data.getArachidicAcid());
                ps.setString(78, data.getMyristoleicAcid());
                ps.setString(79, data.getPalmitoleicAcid());
                ps.setString(80, data.getOleicAcid());
                ps.setString(81, data.getVaccenicAcid());
                ps.setString(82, data.getGadoleicAcid());
                ps.setString(83, data.getLinoleicAcid());
                ps.setString(84, data.getAlphaLinolenicAcid());
                ps.setString(85, data.getGammaLinolenicAcid());
                ps.setString(86, data.getEicosadienoicAcid());
                ps.setString(87, data.getArachidonicAcid());
                ps.setString(88, data.getEicosatrienoicAcid());
                ps.setString(89, data.getEicosapentaenoicAcid());
                ps.setString(90, data.getDocosapentaenoicAcid());
                ps.setString(91, data.getDocosahexaenoicAcid());
                ps.setString(92, data.getTransFat());
                ps.setString(93, data.getTransOleicAcid());
                ps.setString(94, data.getTransLinoleicAcid());
                ps.setString(95, data.getTransLinolenicAcid());
                ps.setString(96, data.getAsh());
                ps.setString(97, data.getCaffeine());
                ps.setString(98, data.getRefName());
                ps.setString(99, data.getPublishingOrganization());
            }

            @Override
            public int getBatchSize() {
                return dataList.size();
            }
        });
    }


    private String getStringCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }

        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        } else {
            return "";
        }
    }
}
