package com.eason.JavaPatterns.Command;

public interface FileSystemReceiver {
    void read();
    void write();
    void create();
    void remove();
}
