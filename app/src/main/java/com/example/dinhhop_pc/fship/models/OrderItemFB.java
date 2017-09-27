package com.example.dinhhop_pc.fship.models;

/**
 * Created by DinhHop-PC on 9/18/2017.
 */

public class OrderItemFB {
    private String image;

    public OrderItemFB() {
    }

    public OrderItemFB(String image, String name, String time, String content) {
        this.image = image;
        this.name = name;
        this.time = time;
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String name;
    private String time;
    private String content;

}
