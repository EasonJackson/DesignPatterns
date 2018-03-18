package com.eason.JavaPatterns.Command;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void read() {
        System.out.println("System reads from a file");
    }

    @Override
    public void write() {
        System.out.println("System writes to a file");
    }

    @Override
    public void create() {
        System.out.println("System creates a file");
    }

    @Override
    public void remove() {
        System.out.println("System removes a file");
    }
}
