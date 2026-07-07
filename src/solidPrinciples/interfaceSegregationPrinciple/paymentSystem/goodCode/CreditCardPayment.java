package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode;

import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.*;

public class CreditCardPayment implements PaymentService, InvoiceService, CouponService, RefundService, ValidationService {

    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }

    @Override
    public void refund() {
        System.out.println("Credit Card Refund");
    }

    @Override
    public void generateInvoice() {
        System.out.println("Credit Card Invoice");
    }

    @Override
    public void applyCoupon() {
        System.out.println("Credit Card Coupon Applied");
    }

    @Override
    public void validate() {
        System.out.println("Credit Card Validated");
    }
}
