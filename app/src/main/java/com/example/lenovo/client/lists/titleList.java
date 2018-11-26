package com.example.lenovo.client.lists;

public class titleList {
    String cityName;
    String storeName,image,deleviryTime,fees,lowest;
    String categoryTitle;
    int categoryImg,favImg;
    String favName,favPrice;

    public titleList(int favImg, String favName, String favPrice) {
        this.favImg = favImg;
        this.favName = favName;
        this.favPrice = favPrice;
    }

    public titleList(int categoryImg, String categoryTitle) {
        this.categoryImg = categoryImg;
        this.categoryTitle = categoryTitle;
    }

    public titleList(String storeName, String image, String deleviryTime, String fees, String lowest) {
        this.storeName = storeName;
        this.image = image;
        this.deleviryTime = deleviryTime;
        this.fees = fees;
        this.lowest = lowest;
    }

    public titleList(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCategoryImg() {
        return categoryImg;
    }

    public void setCategoryImg(int categoryImg) {
        this.categoryImg = categoryImg;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public int getFavImg() {
        return favImg;
    }

    public void setFavImg(int favImg) {
        this.favImg = favImg;
    }

    public String getFavName() {
        return favName;
    }

    public void setFavName(String favName) {
        this.favName = favName;
    }

    public String getFavPrice() {
        return favPrice;
    }

    public void setFavPrice(String favPrice) {
        this.favPrice = favPrice;
    }
}
