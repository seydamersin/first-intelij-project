package com.muates.example3.v2;

import com.muates.example3.v1.Printer;

public class Canon implements Printer, ScanPrinter {

    @Override
    public void yazdir() {
        System.out.println("Yazdirma islemi basarili");
    }

    @Override
    public void tara() {
        System.out.println("Tarama islemi basarılı");
    }
}
