package io.pivotal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class V1Controller {
    public static void main(String[] args) {
        SpringApplication.run(V1Controller.class,args);
    }

    @GetMapping
    public String getVersion() {
        return "V1.2.8";
    }

    @GetMapping("/some-info")
    public String getInfo(RequestBody body) {
        return body.toString();
    }
}
