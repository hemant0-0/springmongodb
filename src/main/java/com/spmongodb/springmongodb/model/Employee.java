package com.spmongodb.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;


@Getter
@Setter
public class Employee {

    @Id
    private String id;
    private String name;
    private String city;
    private List<String> email;

    List<Address>address;

    @DBRef
    private Department department;
}
