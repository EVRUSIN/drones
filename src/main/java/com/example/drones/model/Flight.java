package com.example.drones.model;

import org.springframework.data.annotation.Transient;

import java.util.List;


public class Flight {

    private List<WayPoint> wayPointList;

    private List<TemporaryPoint> passedPoints;

    private List<TemporaryPoint> points;

    public Flight() {
    }

    public Flight(List<WayPoint> wayPointList, List<TemporaryPoint> passedPoints, List<TemporaryPoint> points) {
        this.wayPointList = wayPointList;
        this.passedPoints = passedPoints;
        this.points = points;
    }

    public List<WayPoint> getWayPointList() {
        return wayPointList;
    }

    public void setWayPointList(List<WayPoint> wayPointList) {
        this.wayPointList = wayPointList;
    }

    public List<TemporaryPoint> getPassedPoints() {
        return passedPoints;
    }

    public void setPassedPoints(List<TemporaryPoint> passedPoints) {
        this.passedPoints = passedPoints;
    }

    public List<TemporaryPoint> getPoints() {
        return points;
    }

    public void setPoints(List<TemporaryPoint> points) {
        this.points = points;
    }
}
