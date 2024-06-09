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
import org.springframework.stereotype.Component;


@Component
public class ExcelReader {

    public List<Nutrition> exportNutritionInfo(String excelFilePath) throws IOException {
        List<Nutrition> dataList = new ArrayList<>();

        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue;
            }

            Nutrition data = new Nutrition();
            data.setNo(getStringCellValue(row.getCell(0)));
            data.setSampleId(getStringCellValue(row.getCell(1)));
            data.setFoodCode(getStringCellValue(row.getCell(2)));
            data.setDbGroup(getStringCellValue(row.getCell(3)));
            data.setCommercialProduct(getStringCellValue(row.getCell(4)));
            data.setFoodName(getStringCellValue(row.getCell(5)));
            data.setResearchYear(getStringCellValue(row.getCell(6)));
            data.setMakerName(getStringCellValue(row.getCell(7)));
            data.setCollectionTime(getStringCellValue(row.getCell(8)));
            data.setFoodCategory(getStringCellValue(row.getCell(9)));
            data.setFoodSubcategory(getStringCellValue(row.getCell(10)));
            data.setServingSize(getStringCellValue(row.getCell(11)));
            data.setContentUnit(getStringCellValue(row.getCell(12)));
            data.setTotalContentG(getStringCellValue(row.getCell(13)));
            data.setTotalContentMl(getStringCellValue(row.getCell(14)));
            data.setCalorie(getStringCellValue(row.getCell(15)));
            data.setMoisture(getStringCellValue(row.getCell(16)));
            data.setProtein(getStringCellValue(row.getCell(17)));
            data.setProvince(getStringCellValue(row.getCell(18)));
            data.setCarbohydrate(getStringCellValue(row.getCell(19)));
            data.setTotalSugar(getStringCellValue(row.getCell(20)));
            data.setSucrose(getStringCellValue(row.getCell(21)));
            data.setGlucose(getStringCellValue(row.getCell(22)));
            data.setFructose(getStringCellValue(row.getCell(23)));
            data.setLactose(getStringCellValue(row.getCell(24)));
            data.setMaltose(getStringCellValue(row.getCell(25)));
            data.setTotalDietaryFiber(getStringCellValue(row.getCell(26)));
            data.setCalcium(getStringCellValue(row.getCell(27)));
            data.setIron(getStringCellValue(row.getCell(28)));
            data.setIronMicrograms(getStringCellValue(row.getCell(29)));
            data.setMagnesium(getStringCellValue(row.getCell(30)));
            data.setPhosphorus(getStringCellValue(row.getCell(31)));
            data.setPotassium(getStringCellValue(row.getCell(32)));
            data.setSalt(getStringCellValue(row.getCell(33)));
            data.setZinc(getStringCellValue(row.getCell(34)));
            data.setCopper(getStringCellValue(row.getCell(35)));
            data.setManganese(getStringCellValue(row.getCell(36)));
            data.setSelenium(getStringCellValue(row.getCell(37)));
            data.setRetinol(getStringCellValue(row.getCell(38)));
            data.setBetaCarotene(getStringCellValue(row.getCell(39)));
            data.setVitaminD3(getStringCellValue(row.getCell(40)));
            data.setTocopherol(getStringCellValue(row.getCell(41)));
            data.setTocotrienol(getStringCellValue(row.getCell(42)));
            data.setVitaminB1(getStringCellValue(row.getCell(43)));
            data.setVitaminB2(getStringCellValue(row.getCell(44)));
            data.setNiacin(getStringCellValue(row.getCell(45)));
            data.setFolateDfe(getStringCellValue(row.getCell(46)));
            data.setVitaminB12(getStringCellValue(row.getCell(47)));
            data.setVitaminC(getStringCellValue(row.getCell(48)));
            data.setTotalAminoAcids(getStringCellValue(row.getCell(49)));
            data.setIsoleucine(getStringCellValue(row.getCell(50)));
            data.setLeucine(getStringCellValue(row.getCell(51)));
            data.setLysine(getStringCellValue(row.getCell(52)));
            data.setMethionine(getStringCellValue(row.getCell(53)));
            data.setPhenylalanine(getStringCellValue(row.getCell(54)));
            data.setThreonine(getStringCellValue(row.getCell(55)));
            data.setValine(getStringCellValue(row.getCell(56)));
            data.setHistidine(getStringCellValue(row.getCell(57)));
            data.setArginine(getStringCellValue(row.getCell(58)));
            data.setTyrosine(getStringCellValue(row.getCell(59)));
            data.setCysteine(getStringCellValue(row.getCell(60)));
            data.setAlanine(getStringCellValue(row.getCell(61)));
            data.setAsparticAcid(getStringCellValue(row.getCell(62)));
            data.setGlutamicAcid(getStringCellValue(row.getCell(63)));
            data.setGlycine(getStringCellValue(row.getCell(64)));
            data.setProline(getStringCellValue(row.getCell(65)));
            data.setSerine(getStringCellValue(row.getCell(66)));
            data.setCholesterol(getStringCellValue(row.getCell(67)));
            data.setTotalSaturatedFattyAcids(getStringCellValue(row.getCell(68)));
            data.setButyricAcid(getStringCellValue(row.getCell(69)));
            data.setCaproicAcid(getStringCellValue(row.getCell(70)));
            data.setCaprylicAcid(getStringCellValue(row.getCell(71)));
            data.setCapricAcid(getStringCellValue(row.getCell(72)));
            data.setLauricAcid(getStringCellValue(row.getCell(73)));
            data.setMyristicAcid(getStringCellValue(row.getCell(74)));
            data.setPalmiticAcid(getStringCellValue(row.getCell(75)));
            data.setStearicAcid(getStringCellValue(row.getCell(76)));
            data.setArachidicAcid(getStringCellValue(row.getCell(77)));
            data.setMyristoleicAcid(getStringCellValue(row.getCell(78)));
            data.setPalmitoleicAcid(getStringCellValue(row.getCell(79)));
            data.setOleicAcid(getStringCellValue(row.getCell(80)));
            data.setVaccenicAcid(getStringCellValue(row.getCell(81)));
            data.setGadoleicAcid(getStringCellValue(row.getCell(82)));
            data.setLinoleicAcid(getStringCellValue(row.getCell(83)));
            data.setAlphaLinolenicAcid(getStringCellValue(row.getCell(84)));
            data.setGammaLinolenicAcid(getStringCellValue(row.getCell(85)));
            data.setEicosadienoicAcid(getStringCellValue(row.getCell(86)));
            data.setArachidonicAcid(getStringCellValue(row.getCell(87)));
            data.setEicosatrienoicAcid(getStringCellValue(row.getCell(88)));
            data.setEicosapentaenoicAcid(getStringCellValue(row.getCell(89)));
            data.setDocosapentaenoicAcid(getStringCellValue(row.getCell(90)));
            data.setDocosahexaenoicAcid(getStringCellValue(row.getCell(91)));
            data.setTransFat(getStringCellValue(row.getCell(92)));
            data.setTransOleicAcid(getStringCellValue(row.getCell(93)));
            data.setTransLinoleicAcid(getStringCellValue(row.getCell(94)));
            data.setTransLinolenicAcid(getStringCellValue(row.getCell(95)));
            data.setAsh(getStringCellValue(row.getCell(96)));
            data.setCaffeine(getStringCellValue(row.getCell(97)));
            data.setRefName(getStringCellValue(row.getCell(98)));
            data.setPublishingOrganization(getStringCellValue(row.getCell(99)));

            dataList.add(data);
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

