package com.example.springbootexercisecustomer.dao;

import com.example.springbootexercisecustomer.model.Customer;

import java.util.List;

public interface CustomerDao {

    Customer createCustomer(Customer customer);
    Customer getCustomerById(int id);
    List<Customer> getAllCustomers();
    Customer updateCustomer(int id, Customer updatedCustomer);

}
