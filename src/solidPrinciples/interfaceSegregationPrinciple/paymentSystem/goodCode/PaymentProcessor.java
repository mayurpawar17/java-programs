package solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode;

import solidPrinciples.interfaceSegregationPrinciple.paymentSystem.goodCode.services.*;

public class PaymentProcessor {

    public void processPayment(PaymentService paymentService, RefundService refundService, InvoiceService invoiceService, CouponService couponService) {

        paymentService.pay();
        couponService.applyCoupon();
        invoiceService.generateInvoice();
        refundService.refund();
    }

    public void validatePayment(ValidationService validationService) {
        validationService.validate();
    }
}
