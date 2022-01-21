package com.example.validationchardemo.validationchardemo.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Person {

    private String name;
}
