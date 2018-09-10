package com.example.drones.model;

public class AirplaneCharacteristics {

    private double maxSpeed;

    private double maxAcceleration;

    private double verticalSpeed;

    private double angularSpeed;

    public AirplaneCharacteristics() {}

    public AirplaneCharacteristics(double maxSpeed, double maxAcceleration, double verticalSpeed, double angularSpeed) {
        this.maxSpeed = maxSpeed;
        this.maxAcceleration = maxAcceleration;
        this.verticalSpeed = verticalSpeed;
        this.angularSpeed = angularSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxAcceleration() {
        return maxAcceleration;
    }

    public void setMaxAcceleration(double maxAcceleration) {
        this.maxAcceleration = maxAcceleration;
    }

    public double getVerticalSpeed() {
        return verticalSpeed;
    }

    public void setVerticalSpeed(double verticalSpeed) {
        this.verticalSpeed = verticalSpeed;
    }

    public double getAngularSpeed() {
        return angularSpeed;
    }

    public void setAngularSpeed(double angularSpeed) {
        this.angularSpeed = angularSpeed;
    }
}
