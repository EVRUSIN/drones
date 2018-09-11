package com.example.drones.service;

import com.example.drones.model.Airplane;
import com.example.drones.model.TemporaryPoint;
import com.example.drones.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AirplaneService {

    private AirplaneRepository airplaneRepository;

    @Value("${time.variable}")
    private double time;

    @Autowired
    public AirplaneService(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    public List<TemporaryPoint> calculateRoute(Airplane airplane) {
        TemporaryPoint position = airplane.getPosition();
        return Arrays.asList();
    }

    private double getNextHeight(Airplane airplane, double verticalSpeed, double signum) {
        return airplane.getPosition().getHeight() +  signum * verticalSpeed * time;
    }

    private double getNextAccX(Airplane airplane, double acceleration) {
        double endSpeed = airplane.getPosition().getSpeed() * time + (acceleration * Math.pow(time, 2)) / 2;
        double averageSpeed = (airplane.getPosition().getSpeed() + endSpeed) / 2;
        return airplane.getPosition().getLatitude() + time * averageSpeed * Math.cos(airplane.getPosition().getAngle());
    }

    private double getNextAccY(Airplane airplane, double acceleration) {
        double endSpeed = airplane.getPosition().getSpeed() * time + (acceleration * Math.pow(time, 2)) / 2;
        double averageSpeed = (airplane.getPosition().getSpeed() + endSpeed) / 2;
        return airplane.getPosition().getLongitude() + time * averageSpeed * Math.sin(airplane.getPosition().getAngle());
    }

    private double getNextRotationX(Airplane airplane, double angle) {
        double integral = (2 / (angle * time)) * Math.sin(angle * time / 2) * Math.cos((2 * airplane.getPosition().getAngle() + angle * time) / 2);
        return airplane.getPosition().getLatitude() + airplane.getPosition().getSpeed() * integral * time;
    }

    private double getNextRotationY(Airplane airplane, double angle) {
        double integral = (2 / (angle * time)) * Math.sin((2 * airplane.getPosition().getAngle() + angle * time) / 2) * Math.sin(angle * time / 2);
        return airplane.getPosition().getLongitude() + airplane.getPosition().getSpeed() * integral * time;
    }
}
