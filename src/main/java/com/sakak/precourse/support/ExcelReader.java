package com.sakak.precourse.support;

import com.sakak.precourse.domain.Nutrition;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ExcelReader implements DBMigrationSupporter {

    private final String excelFilePath;

    public ExcelReader(@Value("${excel.path}") final String excelFilePath) {
        this.excelFilePath = excelFilePath;
    }

    public List<Nutrition> migrate() {
        List<Nutrition> dataList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis);) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                Nutrition data = Nutrition.builder()
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

                dataList.add(data);
            }
        } catch (IOException e) {
            System.err.println("Excel 파일을 읽어오는데 실패했습니다!");
        }

        return dataList;
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

