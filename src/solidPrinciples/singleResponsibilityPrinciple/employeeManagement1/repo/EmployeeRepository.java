package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.repo;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;

import java.time.LocalTime;
import java.util.UUID;

public class EmployeeRepository {
    public void save(Employee employee){
        System.out.println("Database connected");
        System.out.println("Save Employee: "+ employee.getName()+ " is database");

    }


    public String generateEmployeeId() {
        return "EID" + UUID.randomUUID();
    }
}
