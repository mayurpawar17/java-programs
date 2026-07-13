package examplesWithSOLIDPrinciple.paymentGatewaySystem.services;

import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.Payment;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.RecurringPayment;
import examplesWithSOLIDPrinciple.paymentGatewaySystem.payment.Refundable;

public class PaymentProcessor {
    public void processPayment(Payment payment, double amount) {

        payment.pay(amount);

    }

    public void refundPayment(Refundable refundable, double amount) {

        refundable.refund(amount);

    }

    public void recurringPayment(RecurringPayment recurringPayment, double amount) {

        recurringPayment.recurringPayment(amount);

    }
}
