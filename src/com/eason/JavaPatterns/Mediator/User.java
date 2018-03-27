package com.eason.JavaPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<String> messagePool;
    private String userId;

    User(String userId) {
        this.userId = userId;
        this.messagePool = new ArrayList<>();
    }

    public void sendMessage(String message, List<User> tos) {
        ChatServiceMediator.getInstance().receiveMessage(message, this, tos);
    }

    public void acceptMessage(String message) {
        messagePool.add(message);
    }

    public String getUserId() {
        return this.userId;
    }

}
