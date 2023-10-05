package org.example.service;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;

import java.util.List;

public interface CustomerService {
    void setCustomer(Customer customer);



    Iterable<CustomerEntity> getCustomer();



    void updateCustomer(Customer customer);



    void deleteCustomer(Long id);



}
