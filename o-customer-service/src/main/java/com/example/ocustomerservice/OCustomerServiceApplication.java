package com.example.ocustomerservice;

import com.example.ocustomerservice.entities.Customer;
import com.example.ocustomerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OCustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer("001","Adria","zaineb@adria.com"));
            customerRepository.save(new Customer("002","LinkedIn","linked@adria.com"));
        };
    }
}
