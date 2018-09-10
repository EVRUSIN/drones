package com.example.drones;

import com.example.drones.model.*;
import com.example.drones.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DronesApplication {

	@Autowired
	private AirplaneRepository airplaneRepository;

	public static void main(String[] args) {
		SpringApplication.run(DronesApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo (AirplaneRepository airplaneRepository) {
		return (args) -> {
			airplaneRepository.deleteAll();

			// save a couple of airplanes
			airplaneRepository.save(new Airplane((long)2,
					new AirplaneCharacteristics(20.0, 5.0, 3.0, 4.0),
				new TemporaryPoint(3.5, 6.7, 4.0, 7.0, 2.0),
				new Flight(
						Arrays.asList(new WayPoint(5.0, 6.0, 3.0, 3.0), new WayPoint(5.0, 6.0, 3.0, 3.0)),
						Arrays.asList(),
						Arrays.asList()
				)
			)
			);

			airplaneRepository.save(new Airplane((long)2,
							new AirplaneCharacteristics(22.0, 6.0, 1.0, 4.0),
							new TemporaryPoint(3.5, 6.7, 4.0, 7.0, 2.0),
							new Flight(
									Arrays.asList(new WayPoint(5.0, 6.0, 3.0, 3.0), new WayPoint(5.0, 6.0, 3.0, 3.0)),
									Arrays.asList(),
									Arrays.asList()
							)
					)
			);


		};

	}
}
