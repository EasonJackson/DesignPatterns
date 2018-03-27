package com.eason.JavaPatterns.Mediator;

import java.util.List;

public interface Mediator {
    void receiveMessage(String message, User from, List<User> tos);
    void sendMessage();
}
