package com.example.drones.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airplane")
public class Airplane {

    @Id
    private String id;

    private Long airplaneId;

    private AirplaneCharacteristics airplaneCharacteristics;

    private TemporaryPoint position;

    private Flight flight;

    public Airplane() {}

    public Airplane(Long airplaneId, AirplaneCharacteristics airplaneCharacteristics, TemporaryPoint position, Flight flight) {
        this.airplaneId = airplaneId;
        this.airplaneCharacteristics = airplaneCharacteristics;
        this.position = position;
        this.flight = flight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(Long airplaneId) {
        this.airplaneId = airplaneId;
    }

    public AirplaneCharacteristics getAirplaneCharacteristics() {
        return airplaneCharacteristics;
    }

    public void setAirplaneCharacteristics(AirplaneCharacteristics airplaneCharacteristics) {
        this.airplaneCharacteristics = airplaneCharacteristics;
    }

    public TemporaryPoint getPosition() {
        return position;
    }

    public void setPosition(TemporaryPoint position) {
        this.position = position;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
