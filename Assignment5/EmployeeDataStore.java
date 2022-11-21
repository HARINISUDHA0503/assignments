package com.Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDataStore {



   private static List<EmployeeDetails> emp=new ArrayList<>();
    private static int empcount=0;
    static
    {
        emp.add(new EmployeeDetails(++empcount,"Harini","BCA","Science",20000));
        emp.add(new EmployeeDetails(++empcount,"abi","BE","Maths",35000));
        emp.add(new EmployeeDetails(++empcount,"Mursh","BCA","Computer",25000));
    }
    public List<EmployeeDetails> findAll()
    {
        return emp;
    }
    public EmployeeDetails findOneEmp(int id)
    {
        Predicate<? super EmployeeDetails> predicate=emps->emps.getEmpId().equals(id);
        return emp.stream().filter(predicate).findFirst().orElse(null);
    }
    public EmployeeDetails save(EmployeeDetails user)
    {
        user.setEmpId(++empcount);
        emp.add(user);
        return user;
    }
    public void deleteOneEmp(int id)
    {
        Predicate<? super EmployeeDetails> predicate=emps->emps.getEmpId().equals(id);
        //return emp.stream().filter(predicate).findFirst().orElse(null);
        emp.removeIf(predicate);
    }
   
}