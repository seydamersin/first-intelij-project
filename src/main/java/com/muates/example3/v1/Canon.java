package com.muates.example3.v1;

public class Canon implements Printer{

    @Override
    public void yazdir() {
        System.out.println("Yazdir");
    }

    @Override
    public void tara() {
        System.out.println("Tara");
    }
}
