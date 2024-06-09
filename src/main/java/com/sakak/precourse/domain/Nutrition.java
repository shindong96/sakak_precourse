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

    private String no;
    private String sampleId;
    private String foodCode;
    private String dbGroup;
    private String commercialProduct;
    private String foodName;

    @Column(name = "research_year")
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
}
