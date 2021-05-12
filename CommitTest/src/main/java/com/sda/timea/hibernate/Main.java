package com.sda.timea.hibernate;

import com.sda.timea.hibernate.model.*;
import com.sda.timea.hibernate.repository.DepartmentRepository;
import com.sda.timea.hibernate.repository.EmployeeRepository;
import com.sda.timea.hibernate.repository.ProjectRepository;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

         DepartmentRepository departmentRepository = new DepartmentRepository();
     //   departmentRepository.save("HR");

     //   Department department = departmentRepository.findById(1);
     //   System.out.println(department);

     //   department.setName("HR Department");
     //   departmentRepository.update(department);
     //   department = departmentRepository.findById(1);
     //   System.out.println(department);

     //   departmentRepository.delete(department);
     //   department = departmentRepository.findById(1);
     //   System.out.println(department);

        ProjectRepository projectRepository = new ProjectRepository();
        Project project = new Project();

        project.setName("Star Monkey Project");
        project.setBudget(123);
        project.setCurrency("EUR");
        project.setProjectType(ProjectType.ENTERPRISE);

        projectRepository.save(project);

        Department department2 = new Department();
        department2.setName("Marketing");
        departmentRepository.save(department2);

        Employee employee1 = new Employee();
        employee1.setFirstName("Mei");
        employee1.setLastName("Wong");
        employee1.setEmail("mewo@yahoo.com");
        employee1.setDateOfBirth(Date.valueOf("1987-02-03"));
        employee1.setPhoneNumber("0744145686");
        employee1.setSalary(5200);
        employee1.setDepartment(department2);

        Employee employee2 = new Employee();
        employee2.setFirstName("Saki");
        employee2.setLastName("Ren");
        employee2.setEmail("saren@yahoo.com");
        employee2.setDateOfBirth(Date.valueOf("1950-02-03"));
        employee2.setPhoneNumber("0743694548");
        employee2.setSalary(13000);
        employee2.setDepartment(department2);

        Account account1 = new Account();
        account1.setCreationDate(Date.valueOf("1996-03-11"));
        Account account2 = new Account();
        account2.setCreationDate(Date.valueOf("1985-10-22"));

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee1, account1);
        employeeRepository.save(employee2, account2);

        System.out.println(employeeRepository.findById(1));
        System.out.println(employeeRepository.findById(2));



    }
}
