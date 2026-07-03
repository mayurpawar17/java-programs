# SRP Practice Example 3 - Student Admission System (No Solution)

## Scenario

A single class is responsible for validating student details, generating
IDs, saving data, creating receipts, sending notifications, assigning
classrooms, creating login accounts, logging, and printing a summary.

## Original Messy Code

``` java
public class StudentAdmissionManager {

    public void admitStudent(String name,
                             String email,
                             String course,
                             double fees) {

        // Validate student details
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid Name");
            return;
        }

        if (email == null || !email.contains("@")) {
            System.out.println("Invalid Email");
            return;
        }

        // Generate Student ID
        String studentId = "STU" + System.currentTimeMillis();
        System.out.println("Generated Student ID: " + studentId);

        // Save student in database
        System.out.println("Saving student into database...");

        // Generate fee receipt
        System.out.println("Generating fee receipt...");

        // Upload receipt to cloud storage
        System.out.println("Uploading receipt...");

        // Send welcome email
        System.out.println("Sending welcome email to " + email);

        // Send SMS
        System.out.println("Sending SMS to student");

        // Assign classroom
        System.out.println("Assigning classroom for " + course);

        // Create student login account
        System.out.println("Creating portal login account...");

        // Log admission
        System.out.println("Writing admission log...");

        // Print admission summary
        System.out.println("\\n===== Admission Summary =====");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Course     : " + course);
        System.out.println("Fees Paid  : " + fees);
        System.out.println("Admission Successful");
    }
}
```

## Your Task

1.  Count how many different responsibilities this class has.
2.  List the classes/services you would create.
3.  Decide which class should act as the orchestrator.
4.  Decide which methods belong in each class.
5.  Identify whether any responsibility can be split further.
