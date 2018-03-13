package com.eason.JavaPatterns.Prototype;

public class Template implements Cloneable {

    private PrototypeAttributes prototypeAttributes;
    private String content;

    Template() {
        this.prototypeAttributes = new PrototypeAttributes(1, "Prototype");
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public Template clone() throws CloneNotSupportedException {
        return new Template();
    }
}
