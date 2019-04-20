package com.example.ibrahim.tourguideapp.parts;

public class Hotel {
    private int hotelImage;
    private String hotelName;
    private String hotelAddress;
    private String hotelPhone;

    public Hotel(int hotelImage, String hotelName, String hotelAddress, String hotelPhone) {
        this.hotelImage = hotelImage;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelPhone = hotelPhone;
    }

    public int getHotelImage() {
        return hotelImage;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }
}
