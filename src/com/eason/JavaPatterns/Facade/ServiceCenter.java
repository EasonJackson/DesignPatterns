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

    public void tackleCustomerTrouble(Trouble trouble) {
        if (trouble == Trouble.REFILLMENT) {
            refillmentService.tackle(trouble);
        } else if (trouble == Trouble.RETURN) {
            returnService.tackle(trouble);
        } else if (trouble == Trouble.FEEDBACK) {
            customFeedback.tackle(trouble);
        } else {
            return;
        }
    }

    public enum Trouble {
        REFILLMENT, RETURN, FEEDBACK
    }
}
