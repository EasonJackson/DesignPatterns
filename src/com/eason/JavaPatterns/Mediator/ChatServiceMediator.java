package com.eason.JavaPatterns.Mediator;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ChatServiceMediator implements Mediator, Runnable {

    private class MessageType {
        String message;
        User from;
        List<User> tos;

        MessageType(String message, User from, List<User> tos) {
            this.message = message;
            this.from = from;
            this.tos = tos;
        }
    }

    private static final ChatServiceMediator instance = new ChatServiceMediator();

    public static ChatServiceMediator getInstance() {
        return instance;
    }

    private static Queue<MessageType> messageQueue = new ArrayBlockingQueue<>(10);

    @Override
    public void receiveMessage(String message, User from, List<User> tos) {
        messageQueue.offer(new MessageType(message, from, tos));
    }

    @Override
    public void sendMessage() {
        try {
            MessageType temp = messageQueue.poll();
            String message = temp.from.getUserId() + temp.message;
            for (User receiver : temp.tos) {
                receiver.acceptMessage(message);
            }
        } catch (EmptyStackException ex) {
            return;
        }
    }

    @Override
    public void run() {
        while (true) {
            sendMessage();
        }
    }
}
