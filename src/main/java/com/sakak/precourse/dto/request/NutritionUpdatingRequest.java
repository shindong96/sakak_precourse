package com.sakak.precourse.dto.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sakak.precourse.domain.Nutrition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NutritionUpdatingRequest {

    private String sampleId;
    private String foodCode;
    private String dbGroup;
    private String commercialProduct;
    private String foodName;
    private String researchYear;
    private String makerName;
    private String collectionTime;
    private String foodCategory;
    private String foodSubcategory;
    private String servingSize;
    private String contentUnit;
    private String totalContentG;
    private String totalContentMl;
    private String calorie;
    private String moisture;
    private String protein;
    private String province;
    private String carbohydrate;
    private String totalSugar;
    private String sucrose;
    private String glucose;
    private String fructose;
    private String lactose;
    private String maltose;
    private String totalDietaryFiber;
    private String calcium;
    private String iron;
    private String ironMicrograms;
    private String magnesium;
    private String phosphorus;
    private String potassium;
    private String salt;
    private String zinc;
    private String copper;
    private String manganese;
    private String selenium;
    private String retinol;
    private String betaCarotene;
    private String vitaminD3;
    private String tocopherol;
    private String tocotrienol;
    private String vitaminB1;
    private String vitaminB2;
    private String niacin;
    private String folateDfe;
    private String vitaminB12;
    private String vitaminC;
    private String totalAminoAcids;
    private String isoleucine;
    private String leucine;
    private String lysine;
    private String methionine;
    private String phenylalanine;
    private String threonine;
    private String valine;
    private String histidine;
    private String arginine;
    private String tyrosine;
    private String cysteine;
    private String alanine;
    private String asparticAcid;
    private String glutamicAcid;
    private String glycine;
    private String proline;
    private String serine;
    private String cholesterol;
    private String totalSaturatedFattyAcids;
    private String butyricAcid;
    private String caproicAcid;
    private String caprylicAcid;
    private String capricAcid;
    private String lauricAcid;
    private String myristicAcid;
    private String palmiticAcid;
    private String stearicAcid;
    private String arachidicAcid;
    private String myristoleicAcid;
    private String palmitoleicAcid;
    private String oleicAcid;
    private String vaccenicAcid;
    private String gadoleicAcid;
    private String linoleicAcid;
    private String alphaLinolenicAcid;
    private String gammaLinolenicAcid;
    private String eicosadienoicAcid;
    private String arachidonicAcid;
    private String eicosatrienoicAcid;
    private String eicosapentaenoicAcid;
    private String docosapentaenoicAcid;
    private String docosahexaenoicAcid;
    private String transFat;
    private String transOleicAcid;
    private String transLinoleicAcid;
    private String transLinolenicAcid;
    private String ash;
    private String caffeine;
    private String refName;
    private String publishingOrganization;

    public Nutrition toDomain() {
        return Nutrition.builder()
                .sampleId(sampleId)
                .foodCode(foodCode)
                .dbGroup(dbGroup)
                .commercialProduct(commercialProduct)
                .foodName(foodName)
                .researchYear(researchYear)
                .makerName(makerName)
                .collectionTime(collectionTime)
                .foodCategory(foodCategory)
                .foodSubcategory(foodSubcategory)
                .servingSize(servingSize)
                .contentUnit(contentUnit)
                .totalContentG(totalContentG)
                .totalContentMl(totalContentMl)
                .calorie(calorie)
                .moisture(moisture)
                .protein(protein)
                .province(province)
                .carbohydrate(carbohydrate)
                .totalSugar(totalSugar)
                .sucrose(sucrose)
                .glucose(glucose)
                .fructose(fructose)
                .lactose(lactose)
                .maltose(maltose)
                .totalDietaryFiber(totalDietaryFiber)
                .calcium(calcium)
                .iron(iron)
                .ironMicrograms(ironMicrograms)
                .magnesium(magnesium)
                .phosphorus(phosphorus)
                .potassium(potassium)
                .salt(salt)
                .zinc(zinc)
                .copper(copper)
                .manganese(manganese)
                .selenium(selenium)
                .retinol(retinol)
                .betaCarotene(betaCarotene)
                .vitaminD3(vitaminD3)
                .tocopherol(tocopherol)
                .tocotrienol(tocotrienol)
                .vitaminB1(vitaminB1)
                .vitaminB2(vitaminB2)
                .niacin(niacin)
                .folateDfe(folateDfe)
                .vitaminB12(vitaminB12)
                .vitaminC(vitaminC)
                .totalAminoAcids(totalAminoAcids)
                .isoleucine(isoleucine)
                .leucine(leucine)
                .lysine(lysine)
                .methionine(methionine)
                .phenylalanine(phenylalanine)
                .threonine(threonine)
                .valine(valine)
                .histidine(histidine)
                .arginine(arginine)
                .tyrosine(tyrosine)
                .cysteine(cysteine)
                .alanine(alanine)
                .asparticAcid(asparticAcid)
                .glutamicAcid(glutamicAcid)
                .glycine(glycine)
                .proline(proline)
                .serine(serine)
                .cholesterol(cholesterol)
                .totalSaturatedFattyAcids(totalSaturatedFattyAcids)
                .butyricAcid(butyricAcid)
                .caproicAcid(caproicAcid)
                .caprylicAcid(caprylicAcid)
                .capricAcid(capricAcid)
                .lauricAcid(lauricAcid)
                .myristicAcid(myristicAcid)
                .palmiticAcid(palmiticAcid)
                .stearicAcid(stearicAcid)
                .arachidicAcid(arachidicAcid)
                .myristoleicAcid(myristoleicAcid)
                .palmitoleicAcid(palmitoleicAcid)
                .oleicAcid(oleicAcid)
                .vaccenicAcid(vaccenicAcid)
                .gadoleicAcid(gadoleicAcid)
                .linoleicAcid(linoleicAcid)
                .alphaLinolenicAcid(alphaLinolenicAcid)
                .gammaLinolenicAcid(gammaLinolenicAcid)
                .eicosadienoicAcid(eicosadienoicAcid)
                .arachidonicAcid(arachidonicAcid)
                .eicosatrienoicAcid(eicosatrienoicAcid)
                .eicosapentaenoicAcid(eicosapentaenoicAcid)
                .docosapentaenoicAcid(docosapentaenoicAcid)
                .docosahexaenoicAcid(docosahexaenoicAcid)
                .transFat(transFat)
                .transOleicAcid(transOleicAcid)
                .transLinoleicAcid(transLinoleicAcid)
                .transLinolenicAcid(transLinolenicAcid)
                .ash(ash)
                .caffeine(caffeine)
                .refName(refName)
                .publishingOrganization(publishingOrganization).build();
    }
}
