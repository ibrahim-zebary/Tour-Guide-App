package com.example.ibrahim.tourguideapp.parts;

public class Restaurant {
    private int restaurantImage;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantOpenCloseTime;
    private String restaurantPhone;

    public Restaurant(int restaurantImage, String restaurantName, String restaurantAddress, String restaurantOpenCloseTime, String restaurantPhone) {
        this.restaurantImage = restaurantImage;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantOpenCloseTime = restaurantOpenCloseTime;
        this.restaurantPhone = restaurantPhone;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public String getRestaurantOpenCloseTime() {
        return restaurantOpenCloseTime;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }
}
