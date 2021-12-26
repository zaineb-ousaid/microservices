package com.example.obillingservice.services;

import com.example.obillingservice.dto.InvoiceRequestDTO;
import com.example.obillingservice.dto.InvoiceResponseDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceResponseDTO getInvoice(String id);
    List<InvoiceResponseDTO> listInvoices();
    InvoiceResponseDTO newInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
