package org.example.service;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;
import org.example.repo.CarRepository;
import org.example.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void setCustomer(Customer customer) {
        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setFirst_name(customer.getFirst_name());
        customerEntity.setSecond_name(customer.getSecond_name());
        customerEntity.setContact(customer.getContact());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setNic(customer.getNic());
        customerRepository.save(customerEntity);
    }



    @Override
    public Iterable<CustomerEntity> getCustomer() {
       return customerRepository.findAll();
    }



    @Override
    public void updateCustomer(Customer customer) {
        CustomerEntity customerEntity=new CustomerEntity();
        customerEntity.setFirst_name(customer.getFirst_name());
        customerEntity.setSecond_name(customer.getSecond_name());
        customerEntity.setContact(customer.getContact());
        customerEntity.setAddress(customer.getAddress());
        customerEntity.setNic(customer.getNic());
        customerRepository.save(customerEntity);
    }



    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}
