package com.example.springbootexercisecustomer.dao;

import com.example.springbootexercisecustomer.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImplement implements CustomerDao{

    private EntityManager entityManager;

    @Autowired
    public CustomerDaoImplement(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer getCustomerById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer updateCustomer(int id, Customer updatedCustomer) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            customer.setId(updatedCustomer.getId());
            customer.setCustomerFirstName(updatedCustomer.getCustomerFirstName());
            customer.setCustomerLastName(updatedCustomer.getCustomerLastName());
            customer.setCustomerPhone(updatedCustomer.getCustomerPhone());
            entityManager.merge(customer);
            return customer;
        }
        return null;
    }
}
