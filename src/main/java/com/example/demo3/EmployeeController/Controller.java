package com.example.demo3.EmployeeController;
import com.example.demo3.Service.EmployeeService;
import com.example.demo3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller
{
    @Autowired
    EmployeeService emp;

   /*-------------Get All Employess-----------------*/
    @GetMapping("/get")
    public List<Employee> getAllEmployee()
    {
        return emp.getAllEmployee();
    }

    /*-------------Insert All Employees---------------*/
    @PostMapping("/post")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        emp.addEmployee(employee);
        return employee;
    }

    /*---------------Delete By Id----------------------*/
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable (value="id")int id)
    {
        emp.deleteEmployee(id);
    }

    /*-------------------Get By Id---------------------*/
    @GetMapping("/get/{id}")
    public Employee  chooseEmployee(@PathVariable (value = "id")int id)
    {
        return emp.chooseEmployee(id);
    }

    /*---------------------Update Existing Data--------------*/
    @PutMapping("/put/{id}")
    public Employee replaceEmployee(@RequestBody Employee employee, @PathVariable(value = "id") int id)
    {
        return emp.replaceEmployee(employee,id);
    }











    //@PostMapping("/save")

//    public Employee Save(@RequestBody Employee employee)
//    {
//        emp.saveOrUpdate(employee);
//        return employee;
//    }

}
