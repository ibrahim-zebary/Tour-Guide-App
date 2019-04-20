package com.example.ibrahim.tourguideapp.parts;

public class Park {
    private int parkImage;
    private String parkName;
    private String parkAddress;
    private String parkOpenCloseTime;
    private String parkOverview;

    public Park(int parkImage, String parkName, String parkAddress, String parkOpenCloseTime, String parkOverview) {
        this.parkImage = parkImage;
        this.parkName = parkName;
        this.parkAddress = parkAddress;
        this.parkOpenCloseTime = parkOpenCloseTime;
        this.parkOverview = parkOverview;
    }

    public int getParkImage() {
        return parkImage;
    }

    public String getParkName() {
        return parkName;
    }

    public String getParkAddress() {
        return parkAddress;
    }

    public String getParkOpenCloseTime() {
        return parkOpenCloseTime;
    }

    public String getParkOverview() {
        return parkOverview;
    }
}
