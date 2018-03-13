package com.eason.JavaPatterns.ProxyPattern;

public class MyExcutor implements CommandExcutor {
    @Override
    public void runCommand(String cmd) throws Exception {

        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
