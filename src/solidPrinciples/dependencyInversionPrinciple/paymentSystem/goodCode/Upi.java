package solidPrinciples.dependencyInversionPrinciple.paymentSystem.goodCode;

public class Upi implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment done with amount " + amount);

    }
}
