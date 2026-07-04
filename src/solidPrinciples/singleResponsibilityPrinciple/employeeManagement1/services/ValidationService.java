package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.services;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;

public class ValidationService {
    public boolean validate(Employee employee) {
        if (employee == null) {
            return false;
        }

        if (employee.getName() == null || employee.getName().isBlank()) {
            return false;
        }

        if (employee.getEmail() == null || employee.getEmail().isBlank()) {
            return false;
        }

        return true;
    }
}
