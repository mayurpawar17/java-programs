package solidPrinciples.dependencyInversionPrinciple.paymentSystem.goodCode;

public class CreditCard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment done with amount " + amount);

    }
}
