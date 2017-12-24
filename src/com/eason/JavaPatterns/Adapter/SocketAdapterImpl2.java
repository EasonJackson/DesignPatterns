package com.eason.JavaPatterns.Adapter;

/**
 * Created by easonjackson on 12/23/17.
 */
public class SocketAdapterImpl2 implements SocketAdapter {
    private Socket socket = new Socket();
    Volt volt = socket.getVolt();

    @Override
    public Volt getVolt120() {
        return volt;
    }

    @Override
    public Volt getVolt12() {
        Volt v = volt;
        v.setVolt(12);
        return v;
    }

    @Override
    public Volt getVolt3() {
        Volt v = volt;
        v.setVolt(3);
        return v;
    }
}
