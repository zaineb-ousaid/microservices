package com.example.ocustomerservice.web;

import com.example.ocustomerservice.dto.CustomerRequestDTO;
import com.example.ocustomerservice.dto.CustomerResponseDTO;
import com.example.ocustomerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CustomerRestController {
    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> customers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO customerById(@PathVariable String id) {
        return customerService.getCustomer(id);
    }

    @PostMapping(path = "/customers")
    public CustomerResponseDTO save(@RequestBody CustomerRequestDTO customerRequestDTO){
        return customerService.save(customerRequestDTO);
    }

    @PutMapping(path = "/customers/{id}")
    public CustomerResponseDTO update(@RequestBody CustomerRequestDTO custReqDTO, @PathVariable String id){
        custReqDTO.setId(id);
        return customerService.save(custReqDTO);
    }
    @DeleteMapping(path = "/customers/{id}")
    public void delete(@PathVariable String id){
        customerService.deleteCustomer(id);
    }
}
