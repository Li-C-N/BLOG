package pers.ljd.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BlogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogServerApplication.class, args);
    }

}
