package com.example.springbootexercisecustomer.service;

import com.example.springbootexercisecustomer.dao.CustomerDao;
import com.example.springbootexercisecustomer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplement implements CustomerService{

    private CustomerDao customerDao;

    @Autowired
    public void UserServiceImplementation(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer updateCustomer(int id, Customer updatedCustomer) {
        return null;
    }
}
