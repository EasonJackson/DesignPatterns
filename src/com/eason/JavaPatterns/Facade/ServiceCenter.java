package com.eason.JavaPatterns.Facade;

public class ServiceCenter {
    private static RefillmentService refillmentService;
    private static ReturnService returnService;
    private static CustomFeedback customFeedback;
    static {
        refillmentService = new RefillmentService();
        returnService = new ReturnService();
        customFeedback = new CustomFeedback();
    }

    public void tackleRefillmentTrouble(Trouble trouble) {
        refillmentService.tackle(trouble);
    }

    public void tackleReturnTrouble(Trouble trouble) {
        returnService.tackle(trouble);
    }

    public void tackleCustomerFeedbackTrouble(Trouble trouble) {
        customFeedback.tackle(trouble);
    }

    public enum Trouble {
        REFILLMENT, RETURN, FEEDBACK
    }
}
