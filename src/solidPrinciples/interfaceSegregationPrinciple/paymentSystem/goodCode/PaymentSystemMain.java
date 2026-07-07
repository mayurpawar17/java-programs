package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode;

public class PaymentSystemMain {
    static void main() {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CashPayment cashPayment = new CashPayment();

        paymentProcessor.processPayment(cashPayment, cashPayment, cashPayment, cashPayment);

        System.out.println();

        CreditCardPayment cardPayment = new CreditCardPayment();

        paymentProcessor.validatePayment(cardPayment);

        paymentProcessor.processPayment(cardPayment, cardPayment, cardPayment, cardPayment);
    }
}
