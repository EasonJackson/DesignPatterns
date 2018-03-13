package com.eason.JavaPatterns.ProxyPattern;

public class ExcutorProxy implements CommandExcutor {
    private CommandExcutor excutor;
    private boolean adminPrivilage;

    ExcutorProxy() {
        this.excutor = new MyExcutor();
    }

    ExcutorProxy(boolean isAdmin) {
        this();
        this.adminPrivilage = isAdmin;
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (adminPrivilage) {
            excutor.runCommand(cmd);
        } else if (cmd.startsWith("write") || cmd.startsWith("modify") || cmd.startsWith("remove")) {
            throw new Exception("Not admin privilege.");
        } else {
            excutor.runCommand(cmd);
        }
    }
}
