package com.sda.timea.hibernate;

import com.sda.timea.hibernate.model.Department;
import com.sda.timea.hibernate.repository.DepartmentRepository;

public class Main {
    public static void main(String[] args) {

        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.save("HR");

        Department department = departmentRepository.findById(1);
        System.out.println(department);

        department.setName("HR Department");
        departmentRepository.update(department);
        department = departmentRepository.findById(1);
        System.out.println(department);

        departmentRepository.delete(department);
        department = departmentRepository.findById(1);
        System.out.println(department);

    }
}
