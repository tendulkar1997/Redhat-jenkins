package com.example.customerproject.service;




        import com.example.customerproject.model.Customer;
        import java.util.List;

public interface CustomerService {
    public Customer createCustomer(Customer customer);
    public List<Customer> getAllCustomer();
}