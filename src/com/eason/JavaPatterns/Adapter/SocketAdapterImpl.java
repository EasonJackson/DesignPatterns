package com.eason.JavaPatterns.Adapter;

/**
 * Created by easonjackson on 12/23/17.
 */
public class SocketAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt getVolt120() {
        return super.getVolt();
    }

    @Override
    public Volt getVolt12() {
        Volt volt = super.getVolt();
        volt.setVolt(12);
        return volt;
    }

    @Override
    public Volt getVolt3() {
        Volt volt = super.getVolt();
        volt.setVolt(3);
        return volt;
    }
}
