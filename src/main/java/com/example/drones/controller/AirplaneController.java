package com.example.drones.controller;

import com.example.drones.model.Airplane;
import com.example.drones.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AirplaneController {

    private AirplaneRepository airplaneRepository;

    @Autowired
    public AirplaneController(AirplaneRepository airplaneRepository) {
        this.airplaneRepository = airplaneRepository;
    }

    @ResponseBody
    @GetMapping("airplane")
    public List<Airplane> get(){
        return airplaneRepository.findAll();
    }

}
