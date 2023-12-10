package com.example.swiggyclone.model;

public class VertiFoodsDataClass {

    private int imageName;
    private String hotelName;
    private String foodRating;
    private String deliveryTime;
    private String foodType;
    private String hotelLocation;
    private int offer;

    public VertiFoodsDataClass(int imageName, String hotelName, String foodRating, String deliveryTime, String foodType, String hotelLocation, int offer) {
        this.imageName = imageName;
        this.hotelName = hotelName;
        this.foodRating = foodRating;
        this.deliveryTime = deliveryTime;
        this.foodType = foodType;
        this.hotelLocation = hotelLocation;
        this.offer = offer;
    }

    public int getImageName() {
        return imageName;
    }

    public void setImageName(int imageName) {
        this.imageName = imageName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(String foodRating) {
        this.foodRating = foodRating;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }
}
