
# Example 2: Banking System

### Scenario

A money transfer method performs many unrelated tasks.

### Original Messy Code

``` java
public class BankAccountManager {

    public void transferMoney(String fromAccount,
                              String toAccount,
                              double amount,
                              String email) {

        if (fromAccount == null || toAccount == null) {
            System.out.println("Invalid account.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        System.out.println("Checking account balance...");

        System.out.println("Deducting " + amount + " from " + fromAccount);

        System.out.println("Adding " + amount + " to " + toAccount);

        System.out.println("Saving transaction...");

        String transactionId = "TXN" + System.currentTimeMillis();
        System.out.println("Transaction ID: " + transactionId);

        System.out.println("Generating receipt PDF...");

        System.out.println("Uploading receipt...");

        System.out.println("Sending confirmation email to " + email);

        System.out.println("Sending SMS notification...");

        System.out.println("Writing audit log...");

        System.out.println("Checking fraud detection...");

        System.out.println("\\n===== Transaction Summary =====");
        System.out.println("From: " + fromAccount);
        System.out.println("To: " + toAccount);
        System.out.println("Amount: " + amount);
        System.out.println("Transaction Successful");
    }
}
```

### Your Task

1.  Identify every responsibility.
2.  Decide which responsibilities should become separate classes.
3.  Decide which class should orchestrate the workflow.
4.  Refactor without changing the behavior.
