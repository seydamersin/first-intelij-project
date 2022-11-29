package com.muates.example1.ocp.v1;

public class EmailNotificationService implements INotificationService{

    @Override
    public void send(String value) {
        System.out.println("Bildiri gönderildi: " + value);
    }
}
