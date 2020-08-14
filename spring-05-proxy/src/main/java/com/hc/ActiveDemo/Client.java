package com.hc.ActiveDemo;

import com.hc.staticDemo.Rent;
import com.hc.staticDemo.Room;

public class Client {
    public static void main(String[] args) {
        Room room = new Room();
        ProxyInvocationHandller pih = new ProxyInvocationHandller();
        pih.setRent(room);
        Rent rent=(Rent) pih.getProxy();
        rent.rentRoom();


    }
}
