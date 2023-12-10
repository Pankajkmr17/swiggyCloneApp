package com.example.swiggyclone.model;

public class DineoutDataClass {

    private int hotelImage;
    private String hotelName;
    private String hotelRating;
    private String hotelLocation;
    private String hotelDistance;
    private String hotelType;
    private String hotelPrice;

    public DineoutDataClass(int hotelImage, String hotelName, String hotelRating, String hotelLocation, String hotelDistance, String hotelType, String hotelPrice) {
        this.hotelImage = hotelImage;
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.hotelLocation = hotelLocation;
        this.hotelDistance = hotelDistance;
        this.hotelType = hotelType;
        this.hotelPrice = hotelPrice;
    }

    public int getHotelImage() {
        return hotelImage;
    }

    public void setHotelImage(int hotelImage) {
        this.hotelImage = hotelImage;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String getHotelDistance() {
        return hotelDistance;
    }

    public void setHotelDistance(String hotelDistance) {
        this.hotelDistance = hotelDistance;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public String getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(String hotelPrice) {
        this.hotelPrice = hotelPrice;
    }






}
