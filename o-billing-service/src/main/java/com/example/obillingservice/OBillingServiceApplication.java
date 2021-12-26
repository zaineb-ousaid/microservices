package com.example.obillingservice;

import com.example.obillingservice.dto.InvoiceRequestDTO;
import com.example.obillingservice.services.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableFeignClients
public class OBillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OBillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(InvoiceService invoiceService){
        return args -> {
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(8700),"001"));
            invoiceService.newInvoice(new InvoiceRequestDTO(new BigDecimal(5400),"001"));
        };
    }
}
