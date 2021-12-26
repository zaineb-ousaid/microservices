package com.example.obillingservice.dto;

import com.example.obillingservice.entities.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceResponseDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOtoInvoice(InvoiceRequestDTO invoiceRequestDTO);
}
