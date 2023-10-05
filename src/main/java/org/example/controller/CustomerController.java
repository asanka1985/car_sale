package org.example.controller;

import org.example.dao.CarEntity;
import org.example.dao.CustomerEntity;
import org.example.dto.Car;
import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService service;
    @PostMapping
    public String setCustomer(@RequestBody Customer customer){
        service.setCustomer(customer);
        return "success";
    }


    @GetMapping
    public Iterable<CustomerEntity> getCustomer(){
        return service.getCustomer();
    }


    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){



        service.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id){
        service.deleteCustomer(Long.valueOf(id));
    }


}
