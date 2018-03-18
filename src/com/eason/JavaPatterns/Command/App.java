package com.eason.JavaPatterns.Command;

public class App {

    public static void main(String[] args) {

        UnixFileSystemReceiver receiver = new UnixFileSystemReceiver();
        UnixFileSystemCommand command = new UnixFileSystemCommand(receiver);

        String command1 = "read";
        command.excute(command1);
    }
}
