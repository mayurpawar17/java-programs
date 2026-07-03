# Single Responsibility Principle (SRP) Practice Workbook

## Goal

For every exercise:

1. Identify all responsibilities.
2. Count how many reasons the class can change.
3. Create proper model, repository, and service classes.
4. Create one orchestrator service.
5. Refactor without changing functionality.

---

# Exercise 1 (Easy)
## Employee Management System

### Responsibilities

- Validate employee
- Save employee
- Calculate yearly salary
- Send welcome email
- Generate employee ID
- Print summary

---

# Exercise 2 (Easy)
## Banking System

### Responsibilities

- Validate accounts
- Check balance
- Deduct money
- Add money
- Save transaction
- Generate receipt
- Upload receipt
- Send email
- Send SMS
- Audit log
- Fraud detection
- Print summary

---

# Exercise 3 (Easy)
## Student Admission System

### Responsibilities

- Validate student
- Generate student ID
- Save student
- Generate fee receipt
- Upload receipt
- Send welcome email
- Send SMS
- Assign classroom
- Create login account
- Write admission log
- Print summary

---

# Exercise 4 (Easy-Medium)
## Food Delivery System

Imagine a class called

FoodOrderManager

that performs

- Validate order
- Check restaurant availability
- Calculate bill
- Apply discount
- Apply GST
- Save order
- Generate invoice
- Send confirmation email
- Notify restaurant
- Notify delivery partner
- Track order
- Print receipt

---

# Exercise 5 (Medium)
## Hospital Appointment System

One class performs

- Validate patient
- Check doctor availability
- Book appointment
- Generate appointment ID
- Save appointment
- Send confirmation email
- Send SMS reminder
- Generate PDF appointment slip
- Upload PDF
- Update doctor's schedule
- Notify receptionist
- Print appointment summary

---

# Exercise 6 (Medium)
## Hotel Booking System

One class performs

- Validate customer
- Check room availability
- Calculate room charges
- Apply seasonal discount
- Generate booking ID
- Save booking
- Generate invoice
- Process payment
- Send booking email
- Send SMS
- Notify housekeeping
- Print booking summary

---

# Exercise 7 (Medium-Hard)
## E-Commerce Order Processing

One class performs

- Validate cart
- Check stock
- Reserve inventory
- Calculate total
- Apply coupon
- Calculate tax
- Process payment
- Save order
- Generate invoice
- Generate shipping label
- Notify warehouse
- Notify customer
- Send email
- Send SMS
- Audit log
- Print receipt

---

# Exercise 8 (Hard)
## Library Management System

One class performs

- Validate member
- Check membership status
- Search book
- Check availability
- Issue book
- Update inventory
- Calculate due date
- Generate borrowing slip
- Send email
- Send SMS
- Notify librarian
- Log transaction
- Print receipt

---

# Exercise 9 (Hard)
## Flight Booking System

One class performs

- Validate passenger
- Search flights
- Check seat availability
- Reserve seat
- Calculate fare
- Apply coupon
- Process payment
- Save booking
- Generate boarding pass
- Upload boarding pass
- Send email
- Send SMS
- Notify airline
- Notify airport
- Log booking
- Print ticket

---

# Exercise 10 (Advanced)
## Online Shopping Platform

A single OrderManager class performs

- Validate customer
- Validate address
- Validate cart
- Check inventory
- Reserve stock
- Calculate subtotal
- Apply coupon
- Apply reward points
- Calculate tax
- Calculate shipping charges
- Calculate final amount
- Process payment
- Detect fraud
- Save order
- Update inventory
- Generate invoice
- Upload invoice
- Send confirmation email
- Send SMS
- Send Push Notification
- Notify warehouse
- Notify delivery partner
- Update loyalty points
- Write audit log
- Print receipt
- Generate analytics event

---

# Challenge For Every Exercise

For every exercise answer:

1. How many responsibilities exist?
2. Which classes will you create?
3. Which class is the Model?
4. Which class is the Repository?
5. Which class is the Orchestrator?
6. Which services will be created?
7. Does every class have only one reason to change?

---

# Senior Developer Rule

Whenever you're unsure, ask yourself:

"If this requirement changes tomorrow, which class should change?"

If your answer is

"Many unrelated things"

then your class is violating the Single Responsibility Principle.

A well-designed class should have only ONE reason to change.