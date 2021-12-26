package com.example.obillingservice.repositories;

import com.example.obillingservice.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository
        extends JpaRepository<Invoice, String> {

    List<Invoice> findByCustomerID(String id);
}