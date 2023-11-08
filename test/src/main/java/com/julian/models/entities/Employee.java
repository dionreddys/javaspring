package com.julian.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
@Entity
@Table(name = "employee")
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid-generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String department;
}
