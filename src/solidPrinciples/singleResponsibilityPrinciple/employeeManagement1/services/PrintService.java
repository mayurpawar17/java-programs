package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.services;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;

public class PrintService {
    public void print(Employee employee, double yearlySalary,String employeeId) {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Email: " + employee.getEmail());
        System.out.println("Employee Salary/Month: " + employee.getSalary());
        System.out.println("Employee Salary/Year: " +yearlySalary);
    }
}
