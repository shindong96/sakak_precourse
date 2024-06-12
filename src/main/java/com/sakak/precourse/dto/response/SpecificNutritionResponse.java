package com.sakak.precourse.dto.response;

import com.sakak.precourse.domain.Nutrition;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder
public class SpecificNutritionResponse {

    private final Long id;
    private final String sampleId;
    private final String foodCode;
    private final String dbGroup;
    private final String commercialProduct;
    private final String foodName;
    private final String researchYear;
    private final String makerName;
    private final String collectionTime;
    private final String foodCategory;
    private final String foodSubcategory;
    private final String servingSize;
    private final String contentUnit;
    private final String totalContentG;
    private final String totalContentMl;
    private final String calorie;
    private final String moisture;
    private final String protein;
    private final String province;
    private final String carbohydrate;
    private final String totalSugar;
    private final String sucrose;
    private final String glucose;
    private final String fructose;
    private final String lactose;
    private final String maltose;
    private final String totalDietaryFiber;
    private final String calcium;
    private final String iron;
    private final String ironMicrograms;
    private final String magnesium;
    private final String phosphorus;
    private final String potassium;
    private final String salt;
    private final String zinc;
    private final String copper;
    private final String manganese;
    private final String selenium;
    private final String retinol;
    private final String betaCarotene;
    private final String vitaminD3;
    private final String tocopherol;
    private final String tocotrienol;
    private final String vitaminB1;
    private final String vitaminB2;
    private final String niacin;
    private final String folateDfe;
    private final String vitaminB12;
    private final String vitaminC;
    private final String totalAminoAcids;
    private final String isoleucine;
    private final String leucine;
    private final String lysine;
    private final String methionine;
    private final String phenylalanine;
    private final String threonine;
    private final String valine;
    private final String histidine;
    private final String arginine;
    private final String tyrosine;
    private final String cysteine;
    private final String alanine;
    private final String asparticAcid;
    private final String glutamicAcid;
    private final String glycine;
    private final String proline;
    private final String serine;
    private final String cholesterol;
    private final String totalSaturatedFattyAcids;
    private final String butyricAcid;
    private final String caproicAcid;
    private final String caprylicAcid;
    private final String capricAcid;
    private final String lauricAcid;
    private final String myristicAcid;
    private final String palmiticAcid;
    private final String stearicAcid;
    private final String arachidicAcid;
    private final String myristoleicAcid;
    private final String palmitoleicAcid;
    private final String oleicAcid;
    private final String vaccenicAcid;
    private final String gadoleicAcid;
    private final String linoleicAcid;
    private final String alphaLinolenicAcid;
    private final String gammaLinolenicAcid;
    private final String eicosadienoicAcid;
    private final String arachidonicAcid;
    private final String eicosatrienoicAcid;
    private final String eicosapentaenoicAcid;
    private final String docosapentaenoicAcid;
    private final String docosahexaenoicAcid;
    private final String transFat;
    private final String transOleicAcid;
    private final String transLinoleicAcid;
    private final String transLinolenicAcid;
    private final String ash;
    private final String caffeine;
    private final String refName;
    private final String publishingOrganization;

    public static SpecificNutritionResponse from(final Nutrition nutrition) {
        return SpecificNutritionResponse.builder()
                .id(nutrition.getId())
                .sampleId(nutrition.getSampleId())
                .foodCode(nutrition.getFoodCode())
                .dbGroup(nutrition.getDbGroup())
                .commercialProduct(nutrition.getCommercialProduct())
                .foodName(nutrition.getFoodName())
                .researchYear(nutrition.getResearchYear())
                .makerName(nutrition.getMakerName())
                .collectionTime(nutrition.getCollectionTime())
                .foodCategory(nutrition.getFoodCategory())
                .foodSubcategory(nutrition.getFoodSubcategory())
                .servingSize(nutrition.getServingSize())
                .contentUnit(nutrition.getContentUnit())
                .totalContentG(nutrition.getTotalContentG())
                .totalContentMl(nutrition.getTotalContentMl())
                .calorie(nutrition.getCalorie())
                .moisture(nutrition.getMoisture())
                .protein(nutrition.getProtein())
                .province(nutrition.getProvince())
                .carbohydrate(nutrition.getCarbohydrate())
                .totalSugar(nutrition.getTotalSugar())
                .sucrose(nutrition.getSucrose())
                .glucose(nutrition.getGlucose())
                .fructose(nutrition.getFructose())
                .lactose(nutrition.getLactose())
                .maltose(nutrition.getMaltose())
                .totalDietaryFiber(nutrition.getTotalDietaryFiber())
                .calcium(nutrition.getCalcium())
                .iron(nutrition.getIron())
                .ironMicrograms(nutrition.getIronMicrograms())
                .magnesium(nutrition.getMagnesium())
                .phosphorus(nutrition.getPhosphorus())
                .potassium(nutrition.getPotassium())
                .salt(nutrition.getSalt())
                .zinc(nutrition.getZinc())
                .copper(nutrition.getCopper())
                .manganese(nutrition.getManganese())
                .selenium(nutrition.getSelenium())
                .retinol(nutrition.getRetinol())
                .betaCarotene(nutrition.getBetaCarotene())
                .vitaminD3(nutrition.getVitaminD3())
                .tocopherol(nutrition.getTocopherol())
                .tocotrienol(nutrition.getTocotrienol())
                .vitaminB1(nutrition.getVitaminB1())
                .vitaminB2(nutrition.getVitaminB2())
                .niacin(nutrition.getNiacin())
                .folateDfe(nutrition.getFolateDfe())
                .vitaminB12(nutrition.getVitaminB12())
                .vitaminC(nutrition.getVitaminC())
                .totalAminoAcids(nutrition.getTotalAminoAcids())
                .isoleucine(nutrition.getIsoleucine())
                .leucine(nutrition.getLeucine())
                .lysine(nutrition.getLysine())
                .methionine(nutrition.getMethionine())
                .phenylalanine(nutrition.getPhenylalanine())
                .threonine(nutrition.getThreonine())
                .valine(nutrition.getValine())
                .histidine(nutrition.getHistidine())
                .arginine(nutrition.getArginine())
                .tyrosine(nutrition.getTyrosine())
                .cysteine(nutrition.getCysteine())
                .alanine(nutrition.getAlanine())
                .asparticAcid(nutrition.getAsparticAcid())
                .glutamicAcid(nutrition.getGlutamicAcid())
                .glycine(nutrition.getGlycine())
                .proline(nutrition.getProline())
                .serine(nutrition.getSerine())
                .cholesterol(nutrition.getCholesterol())
                .totalSaturatedFattyAcids(nutrition.getTotalSaturatedFattyAcids())
                .butyricAcid(nutrition.getButyricAcid())
                .caproicAcid(nutrition.getCaproicAcid())
                .caprylicAcid(nutrition.getCaprylicAcid())
                .capricAcid(nutrition.getCapricAcid())
                .lauricAcid(nutrition.getLauricAcid())
                .myristicAcid(nutrition.getMyristicAcid())
                .palmiticAcid(nutrition.getPalmiticAcid())
                .stearicAcid(nutrition.getStearicAcid())
                .arachidicAcid(nutrition.getArachidicAcid())
                .myristoleicAcid(nutrition.getMyristoleicAcid())
                .palmitoleicAcid(nutrition.getPalmitoleicAcid())
                .oleicAcid(nutrition.getOleicAcid())
                .vaccenicAcid(nutrition.getVaccenicAcid())
                .gadoleicAcid(nutrition.getGadoleicAcid())
                .linoleicAcid(nutrition.getLinoleicAcid())
                .alphaLinolenicAcid(nutrition.getAlphaLinolenicAcid())
                .gammaLinolenicAcid(nutrition.getGammaLinolenicAcid())
                .eicosadienoicAcid(nutrition.getEicosadienoicAcid())
                .arachidonicAcid(nutrition.getArachidonicAcid())
                .eicosatrienoicAcid(nutrition.getEicosatrienoicAcid())
                .eicosapentaenoicAcid(nutrition.getEicosapentaenoicAcid())
                .docosapentaenoicAcid(nutrition.getDocosapentaenoicAcid())
                .docosahexaenoicAcid(nutrition.getDocosahexaenoicAcid())
                .transFat(nutrition.getTransFat())
                .transOleicAcid(nutrition.getTransOleicAcid())
                .transLinoleicAcid(nutrition.getTransLinoleicAcid())
                .transLinolenicAcid(nutrition.getTransLinolenicAcid())
                .ash(nutrition.getAsh())
                .caffeine(nutrition.getCaffeine())
                .refName(nutrition.getRefName())
                .publishingOrganization(nutrition.getPublishingOrganization())
                .build();
    }
}
