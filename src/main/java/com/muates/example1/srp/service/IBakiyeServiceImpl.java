package com.muates.example1.srp.service;

import com.muates.example1.srp.model.Bakiye;

public class IBakiyeServiceImpl implements IBakiyeService {

    @Override
    public Bakiye createBakiye() {
        Bakiye bakiye = new Bakiye();
        bakiye.setBakiye(20000);
        return bakiye;
    }

    @Override
    public Bakiye getBakiye() {
        return createBakiye();
    }
}
