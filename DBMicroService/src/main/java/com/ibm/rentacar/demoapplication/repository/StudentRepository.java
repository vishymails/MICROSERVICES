package com.ibm.rentacar.demoapplication.repository;

import com.ibm.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
