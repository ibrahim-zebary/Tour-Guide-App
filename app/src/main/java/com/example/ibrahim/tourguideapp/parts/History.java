package com.example.ibrahim.tourguideapp.parts;

public class History {
    private int historyImage;
    private String historyName;
    private String historyDetail;
    private String historyLocation;

    public History(int historyImage, String historyName, String historyDetail, String historyLocation) {
        this.historyImage = historyImage;
        this.historyName = historyName;
        this.historyDetail = historyDetail;
        this.historyLocation = historyLocation;
    }

    public int getHistoryImage() {
        return historyImage;
    }

    public String getHistoryName() {
        return historyName;
    }

    public String getHistoryDetail() {
        return historyDetail;
    }

    public String getHistoryLocation() {
        return historyLocation;
    }
}
