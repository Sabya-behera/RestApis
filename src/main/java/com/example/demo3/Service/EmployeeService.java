package com.example.demo3.Service;

import com.example.demo3.Repository.EmployeeRepository;
import com.example.demo3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    @Autowired

    EmployeeRepository repository;


    /*-------------Get All Employess-----------------*/
    public List<Employee> getAllEmployee()
    {
        return repository.findAll();
    }

//     final static List<Employee> list=new ArrayList<>();
//
//    static
//    {
//      list.add(new Employee(101,"Raghu",32000));
//      list.add(new Employee(102,"Ramu",34000));
//      list.add(new Employee(103,"Raju",42000));
//    }


/*-------------Insert All Employees---------------*/
    public Employee addEmployee(Employee e)
    {
       Employee result = repository.save(e);
        return result;
    }

    /*---------------Delete By Id----------------------*/
    public void deleteEmployee(int id)
    {
        repository.deleteById(id);
    }

    /*-------------------Get By Id---------------------*/
     public Employee chooseEmployee(int id)
     {
         Employee result=repository.findById(id).get();
         return result;

     }

     /*-----------------Update Existing Data-------------------*/
     public Employee replaceEmployee(Employee employee,int id)
     {   Employee employee1=repository.findById(id).get();
         employee1.setSal(employee.getSal());
         return repository.save(employee1);
     }
}