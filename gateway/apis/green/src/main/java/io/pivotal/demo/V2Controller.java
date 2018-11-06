package io.pivotal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class V2Controller {
    public static void main(String[] args) {
        SpringApplication.run(V2Controller.class,args);
    }

    @GetMapping
    public String getVersion() {
        return "V2.0.0";
    }
}
