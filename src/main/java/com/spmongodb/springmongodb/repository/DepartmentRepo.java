package com.spmongodb.springmongodb.repository;

import com.spmongodb.springmongodb.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepo extends MongoRepository<Department,String> {
}
