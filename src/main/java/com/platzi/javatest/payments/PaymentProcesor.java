package com.platzi.javatest.payments;

public class PaymentProcesor {
    private PaymentGateway paymentGateway;

    public PaymentProcesor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if(response.getStatus()== PaymentResponse.PaymentStatus.OK){
            return true;
        }
        return false;
    }
}
