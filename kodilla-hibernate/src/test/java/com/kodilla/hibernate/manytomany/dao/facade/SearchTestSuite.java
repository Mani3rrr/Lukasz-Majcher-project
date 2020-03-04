package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.Search;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchTestSuite {

    @Autowired
    private Search search;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSearchCompany(){
        //Given
        Company company1 = new Company("Pepsico");
        int comp1Id = company1.getId();
        Company company2 = new Company("Samsung");
        int comp2Id = company2.getId();
        Company company3 = new Company("Samuraj");
        int comp3Id = company3.getId();


        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companies = search.searchCompany("sam");

        //Then
        Assert.assertEquals(2, companies.size());

        companyDao.deleteAll();
    }

    @Test
    public void testSearchEmployees(){
        //Given
        Employee employee1 = new Employee("Sam","Jacksoon");
        int employee1Id = employee1.getId();
        Employee employee2 = new Employee("Alex","Strumberg");
        int employee2Id = employee2.getId();
        Employee employee3 = new Employee("Maxwell","Tumberg");
        int employee3Id = employee3.getId();

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> employees = search.searchEmployee("berg");

        for(Employee employee: employees){
            System.out.print("Nazwisko " + employee.getLastname() + "\n");
        }

        //Then
        Assert.assertEquals(2, employees.size());

        employeeDao.deleteAll();
    }
}
