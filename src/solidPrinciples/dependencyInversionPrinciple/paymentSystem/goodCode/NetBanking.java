package solidPrinciples.dependencyInversionPrinciple.paymentSystem.goodCode;

public class NetBanking implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Net Banking payment done with amount " + amount);
    }
}
