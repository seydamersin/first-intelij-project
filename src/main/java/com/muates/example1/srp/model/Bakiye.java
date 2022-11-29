package com.muates.example1.srp.model;

public class Bakiye {

    private Integer bakiye;

    public Bakiye() {
    }

    public Bakiye(Integer bakiye) {
        this.bakiye = bakiye;
    }

    public Integer getBakiye() {
        return bakiye;
    }

    public void setBakiye(Integer bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "Bakiye{" +
                "bakiye=" + bakiye +
                '}';
    }
}
