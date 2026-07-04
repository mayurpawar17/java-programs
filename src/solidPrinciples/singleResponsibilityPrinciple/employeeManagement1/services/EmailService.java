package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.services;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;

public class EmailService {
    public  void sendEmail(Employee employee){
        System.out.println("Sending email to "+employee.getEmail());
    }
}
