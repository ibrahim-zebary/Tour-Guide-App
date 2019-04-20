package com.example.ibrahim.tourguideapp.parts;

public class Tourism {
    private int tourismImage;
    private String tourismName;
    private String tourismAddress;
    private String tourismDetail;

    public Tourism(int tourismImage, String tourismName, String tourismAddress, String tourismDetail) {
        this.tourismImage = tourismImage;
        this.tourismName = tourismName;
        this.tourismAddress = tourismAddress;
        this.tourismDetail = tourismDetail;
    }

    public int getTourismImage() {
        return tourismImage;
    }

    public String getTourismName() {
        return tourismName;
    }

    public String getTourismAddress() {
        return tourismAddress;
    }

    public String getTourismDetail() {
        return tourismDetail;
    }
}
