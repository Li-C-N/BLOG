package pers.ljd.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Blog_MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(Blog_MainApplication.class, args);
    }

}
