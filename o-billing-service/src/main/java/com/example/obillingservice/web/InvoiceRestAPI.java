package com.example.obillingservice.web;

import com.example.obillingservice.dto.InvoiceRequestDTO;
import com.example.obillingservice.dto.InvoiceResponseDTO;
import com.example.obillingservice.services.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class InvoiceRestAPI {
    private InvoiceService invoiceService;
    public InvoiceRestAPI(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @GetMapping(path = "/invoices")
    public List<InvoiceResponseDTO> invoices(){
        return invoiceService.listInvoices();
    }
    @GetMapping(path = "/invoices/{id}")
    public InvoiceResponseDTO invoice(@PathVariable String id){
        return invoiceService.getInvoice(id);
    }
    @PostMapping(path="/invoices")
    public InvoiceResponseDTO save(@RequestBody InvoiceRequestDTO invoiceRequestDTO){
        return invoiceService.newInvoice(invoiceRequestDTO);
    }
}
