package com.example.koleg.brewdoglibrary.model;

import android.os.Parcel;
import android.os.Parcelable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Beer extends RealmObject implements Parcelable  {

    public Beer() {

    }
    private String name;
    private String imgUrl;
    private String ibu;
    private String alc;
    private String yeast;
    private String firstBrewed;
    private String description;
    private String foodPairing;
    private String tagLine;
    private String targetFG;
    private String targedOG;
    private String ebc;
    private String srm;
    private String ph;
    private String attenuationLevel;
    private String finalVolume;
    private String boilVolume;
    private String mashTemperature;
    private String mashduration;
    private String fermentationTemperature;
    private String brewersTips;
    private String contributedBy;
    private String malt;
    private String hops;

    @PrimaryKey
    private String id;

    protected Beer(Parcel in) {
        name = in.readString();
        imgUrl = in.readString();
        ibu = in.readString();
        alc = in.readString();
        yeast = in.readString();
        firstBrewed = in.readString();
        description = in.readString();
        foodPairing = in.readString();
        tagLine = in.readString();
        targetFG = in.readString();
        targedOG = in.readString();
        ebc = in.readString();
        srm = in.readString();
        ph = in.readString();
        attenuationLevel = in.readString();
        finalVolume = in.readString();
        boilVolume = in.readString();
        mashTemperature = in.readString();
        mashduration = in.readString();
        fermentationTemperature = in.readString();
        brewersTips = in.readString();
        contributedBy = in.readString();
        malt = in.readString();
        hops = in.readString();
        id = in.readString();
    }

    public static final Parcelable.Creator<Beer> CREATOR = new Parcelable.Creator<Beer>() {
        @Override
        public Beer createFromParcel(Parcel in) {
            return new Beer(in);
        }

        @Override
        public Beer[] newArray(int size) {
            return new Beer[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMalt() {
        return malt;
    }

    public void setMalt(String malt) {
        this.malt = malt;
    }

    public String getHops() {
        return hops;
    }

    public void setHops(String hops) {
        this.hops = hops;
    }


    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getTargetFG() {
        return targetFG;
    }

    public void setTargetFG(String targetFG) {
        this.targetFG = targetFG;
    }

    public String getTargedOG() {
        return targedOG;
    }

    public void setTargedOG(String targedOG) {
        this.targedOG = targedOG;
    }

    public String getEbc() {
        return ebc;
    }

    public void setEbc(String ebc) {
        this.ebc = ebc;
    }

    public String getSrm() {
        return srm;
    }

    public void setSrm(String srm) {
        this.srm = srm;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAttenuationLevel() {
        return attenuationLevel;
    }

    public void setAttenuationLevel(String attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    public String getFinalVolume() {
        return finalVolume;
    }

    public void setFinalVolume(String finalVolume) {
        this.finalVolume = finalVolume;
    }

    public String getBoilVolume() {
        return boilVolume;
    }

    public void setBoilVolume(String boilVolume) {
        this.boilVolume = boilVolume;
    }

    public String getMashTemperature() {
        return mashTemperature;
    }

    public void setMashTemperature(String mashTemperature) {
        this.mashTemperature = mashTemperature;
    }

    public String getMashduration() {
        return mashduration;
    }

    public void setMashduration(String mashduration) {
        this.mashduration = mashduration;
    }

    public String getFermentationTemperature() {
        return fermentationTemperature;
    }

    public void setFermentationTemperature(String fermentationTemperature) {
        this.fermentationTemperature = fermentationTemperature;
    }

    public String getBrewersTips() {
        return brewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getFirstBrewed() {
        return firstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(String foodPairing) {
        this.foodPairing = foodPairing;
    }

    public String getAlc() {
        return alc;
    }

    public void setAlc(String alc) {
        this.alc = alc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(imgUrl);
        dest.writeString(ibu);
        dest.writeString(alc);
        dest.writeString(yeast);
        dest.writeString(firstBrewed);
        dest.writeString(description);
        dest.writeString(foodPairing);
        dest.writeString(tagLine);
        dest.writeString(targetFG);
        dest.writeString(targedOG);
        dest.writeString(ebc);
        dest.writeString(srm);
        dest.writeString(ph);
        dest.writeString(attenuationLevel);
        dest.writeString(finalVolume);
        dest.writeString(boilVolume);
        dest.writeString(mashTemperature);
        dest.writeString(mashduration);
        dest.writeString(fermentationTemperature);
        dest.writeString(brewersTips);
        dest.writeString(contributedBy);
        dest.writeString(malt);
        dest.writeString(hops);
        dest.writeString(id);
    }
}
