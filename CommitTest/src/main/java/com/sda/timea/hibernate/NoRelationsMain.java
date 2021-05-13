package com.sda.timea.hibernate;

import com.sda.timea.hibernate.model.*;
import com.sda.timea.hibernate.repository.DepartmentRepository;
import com.sda.timea.hibernate.utils.SessionManager;


public class NoRelationsMain {

    public static void main(String[] args) {

        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department1 = new Department();
        department1.setName("HR");
        departmentRepository.save(department1);


        Department department = departmentRepository.findById(1);
        System.out.println(department);

        department.setName("HRDepartment");
        departmentRepository.update(department);
        department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.delete(department);
        department = departmentRepository.findById(1);
        System.out.println(department);

        Department department2 = new Department();
        department2.setName("IT");
        departmentRepository.save(department2);

        Department department3 = departmentRepository.findById(3);
        System.out.println(department3);

        SessionManager.shutDown();

    }
}