package vn.edu.iuh.fit.customerservice.service;


import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.customerservice.model.Customer;
import vn.edu.iuh.fit.customerservice.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> findAll() {
        return repository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}