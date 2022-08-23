package com.platzi.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.platzi.javatest.payments.PaymentResponse.PaymentStatus.ERROR;
import static com.platzi.javatest.payments.PaymentResponse.PaymentStatus.OK;
import static org.junit.Assert.*;

public class PaymentProcesorTest {

    private PaymentGateway paymentGateway;
    PaymentProcesor paymentProcesor;

//    Before usa para que se ejecute antes de cada test
    @Before
    public void setup(){
         paymentGateway = Mockito.mock(PaymentGateway.class);
          paymentProcesor= new PaymentProcesor(paymentGateway);
    }


    @Test
    public void payment_is_correct() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(OK));

        assertTrue(paymentProcesor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(ERROR));

        boolean result = paymentProcesor.makePayment(1000);

        assertFalse(result);
    }
}