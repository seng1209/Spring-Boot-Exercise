package com.example.springbootexercisecustomer.service;

import com.example.springbootexercisecustomer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> customers;

    public CustomerService(){
        customers = new ArrayList<>();
        customers.add(new Customer(1,"Chanda", "Sovisal", "092888999"));
        customers.add(new Customer(2,"Kom", "Lina", "092000999"));
        customers.add(new Customer(3,"Chan", "Seyha", "092777666"));
    }

    public ArrayList<Customer> getAllCustomer(){
        return (ArrayList<Customer>) customers;
    }

    public Customer getCustomerByID(int id){
        for (Customer customer : customers){
            if (customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public void addNewCustomer(Customer customer){
        customers.add(customer);
    }

    public void updateCustomerByID(int id, Customer newCustomer){
        for (Customer customer : customers){
            if (customer.getId() == id){
                customer.setId(newCustomer.getId());
                customer.setCustomerLastName(newCustomer.getCustomerLastName());
                customer.setCustomerFirstName(newCustomer.getCustomerFirstName());
                customer.setCustomerPhone(newCustomer.getCustomerPhone());
            }
        }
    }

}
