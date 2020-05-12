package com.ibm.rentacar.demoapplication.service;

import com.ibm.rentacar.demoapplication.model.Student;

public interface StudentService {


    Student save(Student student);
    public Student fetchStudentById(int id);

}
