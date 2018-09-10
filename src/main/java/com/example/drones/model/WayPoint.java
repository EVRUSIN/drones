package com.example.drones.model;

public class WayPoint {

    private double latitude;

    private double longitude;

    private double height;

    private double speed;

    public WayPoint() {
    }

    public WayPoint(double latitude, double longitude, double height, double speed) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height;
        this.speed = speed;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
