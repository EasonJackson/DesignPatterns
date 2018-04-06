package com.eason.JavaPatterns.Interpreter;

import sun.jvm.hotspot.interpreter.Interpreter;

public class InterpreterApp {

    public InterpreterContext ic = new InterpreterContext();

    public String interpret(String str){
        Expression exp = null;

        if(str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else if(str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else {
            return str;
        }

        return exp.interpret(ic);
    }

    public static void main(String[] args) {

        String st1 = "10 Binary";
        String st2 = "12 Hexadecimal";

        InterpreterApp it = new InterpreterApp();
        System.out.println(it.interpret(st1));

        System.out.println(it.interpret(st2));

    }
}
