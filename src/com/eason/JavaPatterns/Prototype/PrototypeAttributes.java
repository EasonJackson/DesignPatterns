package com.eason.JavaPatterns.Prototype;

import java.util.Calendar;
import java.util.Date;

public class PrototypeAttributes {
    int id;
    Date date;
    String mark;

    PrototypeAttributes(int id, String mark) {
        this.id = id;
        this.mark = mark;
        this.date = Calendar.getInstance().getTime();
    }
}
