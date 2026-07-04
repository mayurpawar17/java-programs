package solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.services;

import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.model.Employee;
import solidPrinciples.singleResponsibilityPrinciple.employeeManagement1.repo.EmployeeRepository;

import java.sql.Time;
import java.time.LocalTime;

public class EmployeeService {

    private ValidationService validationService = new ValidationService();
    private SalaryService salaryService = new SalaryService();
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private EmailService emailService = new EmailService();
    private PdfService pdfService = new PdfService();
    private UploadService uploadService = new UploadService();
    private NotificationService notificationService = new NotificationService();
    private LoggingService loggingService = new LoggingService();
    private PrintService printService = new PrintService();

    public void addEmployee(Employee employee) {
        if (!validationService.validate(employee)) {
            System.out.println("Validation Failed");
        } else {
            double yearlySalary = salaryService.calculateSalary(employee.getSalary());
            employeeRepository.save(employee);
            String employeeId = employeeRepository.generateEmployeeId();
            emailService.sendEmail(employee);
            pdfService.generatePdf();
            uploadService.uploadPdf();
            notificationService.notifyHr();
            notificationService.notifyFinance();
            loggingService.log();
            printService.print(employee, yearlySalary, employeeId);

        }


    }

}
