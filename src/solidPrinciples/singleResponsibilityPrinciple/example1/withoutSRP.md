## Example 1: Employee Management

### Scenario

A single class performs all of the following:

-   Validate employee name and email
-   Calculate yearly salary
-   Save employee to database
-   Generate employee ID
-   Send welcome email
-   Generate appointment letter PDF
-   Upload PDF to cloud
-   Notify HR
-   Notify Finance
-   Write logs
-   Print employee summary

### Original Messy Code

``` java
public class EmployeeManager {

    public void addEmployee(String name, String email, double salary) {

        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
            return;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email");
            return;
        }

        double yearlySalary = salary * 12;

        System.out.println("Connecting to database...");
        System.out.println("Saving employee...");
        System.out.println("Employee saved successfully.");

        String employeeId = "EMP" + System.currentTimeMillis();
        System.out.println("Generated Employee ID: " + employeeId);

        System.out.println("Sending welcome email to " + email);

        System.out.println("Employee created at: " + java.time.LocalDateTime.now());

        System.out.println("Generating appointment letter PDF...");

        System.out.println("Uploading PDF to cloud...");

        System.out.println("Sending notification to HR...");

        System.out.println("Sending notification to Finance...");

        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + yearlySalary);
    }
}
```

### Your Task

1.  Identify every responsibility.
2.  Decide how many classes are needed.
3.  Name the classes.
4.  Decide which class should coordinate everything.
