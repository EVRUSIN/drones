package com.example.drones.model;


public class TemporaryPoint {

    private double latitude;

    private double longitude;

    private double height;

    private double speed;

    private double angle;

    public TemporaryPoint() {
    }

    public TemporaryPoint(double latitude, double longitude, double height, double speed, double angle) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height;
        this.speed = speed;
        this.angle = angle;
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

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
