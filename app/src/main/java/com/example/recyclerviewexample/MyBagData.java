package com.example.recyclerviewexample;

public class MyBagData {
    private String bagName;
    private String bagPrice;
    private Integer bagImage;

    public MyBagData(String bagName, String bagPrice, Integer bagImage) {
        this.bagName = bagName;
        this.bagPrice = bagPrice;
        this.bagImage = bagImage;
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public String getBagPrice() {
        return bagPrice;
    }

    public void setBagPrice(String bagPrice) {
        this.bagPrice = bagPrice;
    }

    public Integer getBagImage() {
        return bagImage;
    }

    public void setBagImage(Integer bagImage) {
        this.bagImage = bagImage;
    }
}
