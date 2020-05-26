package com.zoyo.networkshooter.pojo;

import java.io.Serializable;

public class BookingsModel implements Serializable {
    private String size;
    private String prize;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
}
