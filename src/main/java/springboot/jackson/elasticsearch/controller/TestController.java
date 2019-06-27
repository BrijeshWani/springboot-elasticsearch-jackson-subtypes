package springboot.jackson.elasticsearch.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.jackson.elasticsearch.constants.VehicleType;
import springboot.jackson.elasticsearch.entity.Bike;
import springboot.jackson.elasticsearch.entity.Car;
import springboot.jackson.elasticsearch.repo.BikeRepo;
import springboot.jackson.elasticsearch.repo.CarRepo;

@RestController
@RequestMapping("/vehicle")
public class TestController {

    @Autowired
    private BikeRepo bikeRepo;

    @Autowired
    private CarRepo  carRepo;

    @GetMapping("/save-random")
    public @ResponseBody ResponseEntity<String> test() {
        Bike bike = new Bike(VehicleType.BIKE);
        bike.setId(UUID.randomUUID().toString());
        bike.setNumberOfTyres(2);
        bike.setName("Honda");
        bikeRepo.save(bike);

        Car car = new Car(VehicleType.CAR);
        car.setId(UUID.randomUUID().toString());
        car.setNumberOfTyres(4);
        car.setName("Suzuki");
        carRepo.save(car);
        return ResponseEntity.status(HttpStatus.OK).body("Test API");
    }
}
