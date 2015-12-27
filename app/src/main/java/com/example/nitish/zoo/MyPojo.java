package com.example.nitish.zoo;

/**
 * Created by user on 18-12-2015.
 */
public class MyPojo {
    String title;
    String desc;
    int image;

    public MyPojo(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
