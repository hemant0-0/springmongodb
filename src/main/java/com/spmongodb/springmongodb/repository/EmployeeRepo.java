package com.spmongodb.springmongodb.repository;

import com.spmongodb.springmongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String>{
}
