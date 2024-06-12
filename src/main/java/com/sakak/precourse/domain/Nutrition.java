package com.sakak.precourse.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "nutrition")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @Column(name = "total_content_g")
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

    @Column(name = "vitamin_d3")
    private String vitaminD3;

    private String tocopherol;
    private String tocotrienol;

    @Column(name = "vitamin_b1")
    private String vitaminB1;

    @Column(name = "vitamin_b2")
    private String vitaminB2;

    private String niacin;
    private String folateDfe;

    @Column(name = "vitamin_b12")
    private String vitaminB12;

    @Column(name = "vitamin_c")
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

    public void update(final Nutrition updatingNutritionInfo) {
        this.sampleId = (updatingNutritionInfo.sampleId == null) ? this.sampleId : updatingNutritionInfo.sampleId;
        this.foodCode = (updatingNutritionInfo.foodCode == null) ? this.foodCode : updatingNutritionInfo.foodCode;
        this.dbGroup = (updatingNutritionInfo.dbGroup == null) ? this.dbGroup : updatingNutritionInfo.dbGroup;
        this.commercialProduct = (updatingNutritionInfo.commercialProduct == null) ? this.commercialProduct
                : updatingNutritionInfo.commercialProduct;
        this.foodName = (updatingNutritionInfo.foodName == null) ? this.foodName : updatingNutritionInfo.foodName;
        this.researchYear =
                (updatingNutritionInfo.researchYear == null) ? this.researchYear : updatingNutritionInfo.researchYear;
        this.makerName = (updatingNutritionInfo.makerName == null) ? this.makerName : updatingNutritionInfo.makerName;
        this.collectionTime = (updatingNutritionInfo.collectionTime == null) ? this.collectionTime
                : updatingNutritionInfo.collectionTime;
        this.foodCategory =
                (updatingNutritionInfo.foodCategory == null) ? this.foodCategory : updatingNutritionInfo.foodCategory;
        this.foodSubcategory = (updatingNutritionInfo.foodSubcategory == null) ? this.foodSubcategory
                : updatingNutritionInfo.foodSubcategory;
        this.servingSize =
                (updatingNutritionInfo.servingSize == null) ? this.servingSize : updatingNutritionInfo.servingSize;
        this.contentUnit =
                (updatingNutritionInfo.contentUnit == null) ? this.contentUnit : updatingNutritionInfo.contentUnit;
        this.totalContentG = (updatingNutritionInfo.totalContentG == null) ? this.totalContentG
                : updatingNutritionInfo.totalContentG;
        this.totalContentMl = (updatingNutritionInfo.totalContentMl == null) ? this.totalContentMl
                : updatingNutritionInfo.totalContentMl;
        this.calorie = (updatingNutritionInfo.calorie == null) ? this.calorie : updatingNutritionInfo.calorie;
        this.moisture = (updatingNutritionInfo.moisture == null) ? this.moisture : updatingNutritionInfo.moisture;
        this.protein = (updatingNutritionInfo.protein == null) ? this.protein : updatingNutritionInfo.protein;
        this.province = (updatingNutritionInfo.province == null) ? this.province : updatingNutritionInfo.province;
        this.carbohydrate =
                (updatingNutritionInfo.carbohydrate == null) ? this.carbohydrate : updatingNutritionInfo.carbohydrate;
        this.totalSugar =
                (updatingNutritionInfo.totalSugar == null) ? this.totalSugar : updatingNutritionInfo.totalSugar;
        this.sucrose = (updatingNutritionInfo.sucrose == null) ? this.sucrose : updatingNutritionInfo.sucrose;
        this.glucose = (updatingNutritionInfo.glucose == null) ? this.glucose : updatingNutritionInfo.glucose;
        this.fructose = (updatingNutritionInfo.fructose == null) ? this.fructose : updatingNutritionInfo.fructose;
        this.lactose = (updatingNutritionInfo.lactose == null) ? this.lactose : updatingNutritionInfo.lactose;
        this.maltose = (updatingNutritionInfo.maltose == null) ? this.maltose : updatingNutritionInfo.maltose;
        this.totalDietaryFiber = (updatingNutritionInfo.totalDietaryFiber == null) ? this.totalDietaryFiber
                : updatingNutritionInfo.totalDietaryFiber;
        this.calcium = (updatingNutritionInfo.calcium == null) ? this.calcium : updatingNutritionInfo.calcium;
        this.iron = (updatingNutritionInfo.iron == null) ? this.iron : updatingNutritionInfo.iron;
        this.ironMicrograms = (updatingNutritionInfo.ironMicrograms == null) ? this.ironMicrograms
                : updatingNutritionInfo.ironMicrograms;
        this.magnesium = (updatingNutritionInfo.magnesium == null) ? this.magnesium : updatingNutritionInfo.magnesium;
        this.phosphorus =
                (updatingNutritionInfo.phosphorus == null) ? this.phosphorus : updatingNutritionInfo.phosphorus;
        this.potassium = (updatingNutritionInfo.potassium == null) ? this.potassium : updatingNutritionInfo.potassium;
        this.salt = (updatingNutritionInfo.salt == null) ? this.salt : updatingNutritionInfo.salt;
        this.zinc = (updatingNutritionInfo.zinc == null) ? this.zinc : updatingNutritionInfo.zinc;
        this.copper = (updatingNutritionInfo.copper == null) ? this.copper : updatingNutritionInfo.copper;
        this.manganese = (updatingNutritionInfo.manganese == null) ? this.manganese : updatingNutritionInfo.manganese;
        this.selenium = (updatingNutritionInfo.selenium == null) ? this.selenium : updatingNutritionInfo.selenium;
        this.retinol = (updatingNutritionInfo.retinol == null) ? this.retinol : updatingNutritionInfo.retinol;
        this.betaCarotene =
                (updatingNutritionInfo.betaCarotene == null) ? this.betaCarotene : updatingNutritionInfo.betaCarotene;
        this.vitaminD3 = (updatingNutritionInfo.vitaminD3 == null) ? this.vitaminD3 : updatingNutritionInfo.vitaminD3;
        this.tocopherol =
                (updatingNutritionInfo.tocopherol == null) ? this.tocopherol : updatingNutritionInfo.tocopherol;
        this.tocotrienol =
                (updatingNutritionInfo.tocotrienol == null) ? this.tocotrienol : updatingNutritionInfo.tocotrienol;
        this.vitaminB1 = (updatingNutritionInfo.vitaminB1 == null) ? this.vitaminB1 : updatingNutritionInfo.vitaminB1;
        this.vitaminB2 = (updatingNutritionInfo.vitaminB2 == null) ? this.vitaminB2 : updatingNutritionInfo.vitaminB2;
        this.niacin = (updatingNutritionInfo.niacin == null) ? this.niacin : updatingNutritionInfo.niacin;
        this.folateDfe = (updatingNutritionInfo.folateDfe == null) ? this.folateDfe : updatingNutritionInfo.folateDfe;
        this.vitaminB12 =
                (updatingNutritionInfo.vitaminB12 == null) ? this.vitaminB12 : updatingNutritionInfo.vitaminB12;
        this.vitaminC = (updatingNutritionInfo.vitaminC == null) ? this.vitaminC : updatingNutritionInfo.vitaminC;
        this.totalAminoAcids = (updatingNutritionInfo.totalAminoAcids == null) ? this.totalAminoAcids
                : updatingNutritionInfo.totalAminoAcids;
        this.isoleucine =
                (updatingNutritionInfo.isoleucine == null) ? this.isoleucine : updatingNutritionInfo.isoleucine;
        this.leucine = (updatingNutritionInfo.leucine == null) ? this.leucine : updatingNutritionInfo.leucine;
        this.lysine = (updatingNutritionInfo.lysine == null) ? this.lysine : updatingNutritionInfo.lysine;
        this.methionine =
                (updatingNutritionInfo.methionine == null) ? this.methionine : updatingNutritionInfo.methionine;
        this.phenylalanine = (updatingNutritionInfo.phenylalanine == null) ? this.phenylalanine
                : updatingNutritionInfo.phenylalanine;
        this.threonine = (updatingNutritionInfo.threonine == null) ? this.threonine : updatingNutritionInfo.threonine;
        this.valine = (updatingNutritionInfo.valine == null) ? this.valine : updatingNutritionInfo.valine;
        this.histidine = (updatingNutritionInfo.histidine == null) ? this.histidine : updatingNutritionInfo.histidine;
        this.arginine = (updatingNutritionInfo.arginine == null) ? this.arginine : updatingNutritionInfo.arginine;
        this.tyrosine = (updatingNutritionInfo.tyrosine == null) ? this.tyrosine : updatingNutritionInfo.tyrosine;
        this.cysteine = (updatingNutritionInfo.cysteine == null) ? this.cysteine : updatingNutritionInfo.cysteine;
        this.alanine = (updatingNutritionInfo.alanine == null) ? this.alanine : updatingNutritionInfo.alanine;
        this.asparticAcid =
                (updatingNutritionInfo.asparticAcid == null) ? this.asparticAcid : updatingNutritionInfo.asparticAcid;
        this.glutamicAcid =
                (updatingNutritionInfo.glutamicAcid == null) ? this.glutamicAcid : updatingNutritionInfo.glutamicAcid;
        this.glycine = (updatingNutritionInfo.glycine == null) ? this.glycine : updatingNutritionInfo.glycine;
        this.proline = (updatingNutritionInfo.proline == null) ? this.proline : updatingNutritionInfo.proline;
        this.serine = (updatingNutritionInfo.serine == null) ? this.serine : updatingNutritionInfo.serine;
        this.cholesterol =
                (updatingNutritionInfo.cholesterol == null) ? this.cholesterol : updatingNutritionInfo.cholesterol;
        this.totalSaturatedFattyAcids =
                (updatingNutritionInfo.totalSaturatedFattyAcids == null) ? this.totalSaturatedFattyAcids
                        : updatingNutritionInfo.totalSaturatedFattyAcids;
        this.butyricAcid =
                (updatingNutritionInfo.butyricAcid == null) ? this.butyricAcid : updatingNutritionInfo.butyricAcid;
        this.caproicAcid =
                (updatingNutritionInfo.caproicAcid == null) ? this.caproicAcid : updatingNutritionInfo.caproicAcid;
        this.caprylicAcid =
                (updatingNutritionInfo.caprylicAcid == null) ? this.caprylicAcid : updatingNutritionInfo.caprylicAcid;
        this.capricAcid =
                (updatingNutritionInfo.capricAcid == null) ? this.capricAcid : updatingNutritionInfo.capricAcid;
        this.lauricAcid =
                (updatingNutritionInfo.lauricAcid == null) ? this.lauricAcid : updatingNutritionInfo.lauricAcid;
        this.myristicAcid =
                (updatingNutritionInfo.myristicAcid == null) ? this.myristicAcid : updatingNutritionInfo.myristicAcid;
        this.palmiticAcid =
                (updatingNutritionInfo.palmiticAcid == null) ? this.palmiticAcid : updatingNutritionInfo.palmiticAcid;
        this.stearicAcid =
                (updatingNutritionInfo.stearicAcid == null) ? this.stearicAcid : updatingNutritionInfo.stearicAcid;
        this.arachidicAcid = (updatingNutritionInfo.arachidicAcid == null) ? this.arachidicAcid
                : updatingNutritionInfo.arachidicAcid;
        this.myristoleicAcid = (updatingNutritionInfo.myristoleicAcid == null) ? this.myristoleicAcid
                : updatingNutritionInfo.myristoleicAcid;
        this.palmitoleicAcid = (updatingNutritionInfo.palmitoleicAcid == null) ? this.palmitoleicAcid
                : updatingNutritionInfo.palmitoleicAcid;
        this.oleicAcid = (updatingNutritionInfo.oleicAcid == null) ? this.oleicAcid : updatingNutritionInfo.oleicAcid;
        this.vaccenicAcid =
                (updatingNutritionInfo.vaccenicAcid == null) ? this.vaccenicAcid : updatingNutritionInfo.vaccenicAcid;
        this.gadoleicAcid =
                (updatingNutritionInfo.gadoleicAcid == null) ? this.gadoleicAcid : updatingNutritionInfo.gadoleicAcid;
        this.linoleicAcid =
                (updatingNutritionInfo.linoleicAcid == null) ? this.linoleicAcid : updatingNutritionInfo.linoleicAcid;
        this.alphaLinolenicAcid = (updatingNutritionInfo.alphaLinolenicAcid == null) ? this.alphaLinolenicAcid
                : updatingNutritionInfo.alphaLinolenicAcid;
        this.gammaLinolenicAcid = (updatingNutritionInfo.gammaLinolenicAcid == null) ? this.gammaLinolenicAcid
                : updatingNutritionInfo.gammaLinolenicAcid;
        this.eicosadienoicAcid = (updatingNutritionInfo.eicosadienoicAcid == null) ? this.eicosadienoicAcid
                : updatingNutritionInfo.eicosadienoicAcid;
        this.arachidonicAcid = (updatingNutritionInfo.arachidonicAcid == null) ? this.arachidonicAcid
                : updatingNutritionInfo.arachidonicAcid;
        this.eicosatrienoicAcid = (updatingNutritionInfo.eicosatrienoicAcid == null) ? this.eicosatrienoicAcid
                : updatingNutritionInfo.eicosatrienoicAcid;
        this.eicosapentaenoicAcid = (updatingNutritionInfo.eicosapentaenoicAcid == null) ? this.eicosapentaenoicAcid
                : updatingNutritionInfo.eicosapentaenoicAcid;
        this.docosapentaenoicAcid = (updatingNutritionInfo.docosapentaenoicAcid == null) ? this.docosapentaenoicAcid
                : updatingNutritionInfo.docosapentaenoicAcid;
        this.docosahexaenoicAcid = (updatingNutritionInfo.docosahexaenoicAcid == null) ? this.docosahexaenoicAcid
                : updatingNutritionInfo.docosahexaenoicAcid;
        this.transFat = (updatingNutritionInfo.transFat == null) ? this.transFat : updatingNutritionInfo.transFat;
        this.transOleicAcid = (updatingNutritionInfo.transOleicAcid == null) ? this.transOleicAcid
                : updatingNutritionInfo.transOleicAcid;
        this.transLinoleicAcid = (updatingNutritionInfo.transLinoleicAcid == null) ? this.transLinoleicAcid
                : updatingNutritionInfo.transLinoleicAcid;
        this.transLinolenicAcid = (updatingNutritionInfo.transLinolenicAcid == null) ? this.transLinolenicAcid
                : updatingNutritionInfo.transLinolenicAcid;
        this.ash = (updatingNutritionInfo.ash == null) ? this.ash : updatingNutritionInfo.ash;
        this.caffeine = (updatingNutritionInfo.caffeine == null) ? this.caffeine : updatingNutritionInfo.caffeine;
        this.refName = (updatingNutritionInfo.refName == null) ? this.refName : updatingNutritionInfo.refName;
        this.publishingOrganization =
                (updatingNutritionInfo.publishingOrganization == null) ? this.publishingOrganization
                        : updatingNutritionInfo.publishingOrganization;
    }
}
