```java
public class PaymentService {

    private CreditCardPayment payment = new CreditCardPayment();

    public void pay(double amount) {
        payment.pay(amount);
    }
}
```