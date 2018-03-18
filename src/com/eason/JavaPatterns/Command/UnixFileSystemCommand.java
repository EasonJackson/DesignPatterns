package com.eason.JavaPatterns.Command;

public class UnixFileSystemCommand implements Command {
    private UnixFileSystemReceiver receiver;

    UnixFileSystemCommand(UnixFileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute(String command) {
        if (command.equals("read")){
            receiver.read();
        } else if (command.equals("write")) {
            receiver.write();
        } else if (command.equals("create")) {
            receiver.create();
        } else if (command.equals("remove")) {
            receiver.remove();
        } else {
            System.out.println("Command not supported by system");
        }
    }
}
