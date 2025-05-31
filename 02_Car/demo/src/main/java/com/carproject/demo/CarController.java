package com.carproject.demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin(origins = "http://localhost:5173")
public class CarController {

    @GetMapping
    public List<Car> getCars() {
        return List.of(
                new Car("Audi", 50000, "https://media.audi.com/is/image/audi/nemo/models/a7/rs-7-sportback/my-2022/nemo-derivate-startpage/feature-gallery/810x1080-rs7_2020_1544.jpg?width=768"),
                new Car("BMW", 60000, "https://www.bmw-special-sales.com/content/dam/bmw/marketBMWCOM/bmw-special-sales_com/common/protection/7-protection/bmw-css-7-series-protection-ms-new-standard.jpg"),
                new Car("Tesla", 70000, "https://upload.wikimedia.org/wikipedia/commons/9/95/2024_Tesla_Cybertruck_Foundation_Series%2C_front_left_%28Greenwich%29.jpg")
        );
    }
}
