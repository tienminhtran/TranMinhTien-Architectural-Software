package vn.edu.iuh.fit.discovery;

/*
 * @description:
 * @author: Tien Minh Tran
 * @date: 4/25/2025
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
