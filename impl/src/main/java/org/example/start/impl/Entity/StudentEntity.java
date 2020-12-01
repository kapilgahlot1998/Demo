package org.example.start.impl.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "student_info")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String name;
    int age;
    int studentId;

}
