package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;
import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.services.EmployeeService;

public class EmployeeManagementMain {
    static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.addEmployee(new Employee("Mayur", "mayur@gmail.com", 20000.0));
    }
}
