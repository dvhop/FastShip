package com.example.dinhhop_pc.fship.models;

/**
 * Created by DinhHop-PC on 9/14/2017.
 */

public class OrderItem {
    private String id;
    private String nameStore;
    private String imageStore;
    private int status;
    private String startLocation;
    private String endLocation;
    private double moneyBy;
    private double moneyShip;
    private double distance;
    private String timeShip;

    public OrderItem() {
    }

    public OrderItem(String id, String nameStore, String imageStore, int status, String startLocation,
                     String endLocation, double moneyBy, double moneyShip, double distance, String timeShip) {
        this.id = id;
        this.nameStore = nameStore;
        this.imageStore = imageStore;
        this.status = status;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.moneyBy = moneyBy;
        this.moneyShip = moneyShip;
        this.distance = distance;
        this.timeShip = timeShip;
    }

    public String getId() {
        return id;
    }

    public double getMoneyBy() {
        return moneyBy;
    }

    public void setMoneyBy(double moneyBy) {
        this.moneyBy = moneyBy;
    }

    public double getMoneyShip() {
        return moneyShip;
    }

    public void setMoneyShip(double moneyShip) {
        this.moneyShip = moneyShip;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getImageStore() {
        return imageStore;
    }

    public void setImageStore(String imageStore) {
        this.imageStore = imageStore;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getTimeShip() {
        return timeShip;
    }

    public void setTimeShip(String timeShip) {
        this.timeShip = timeShip;
    }
}
