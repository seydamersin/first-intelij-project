package com.muates.example1.srp.service;

import com.muates.example1.srp.model.Address;

public class AddressServiceImpl implements IAddressService {

    @Override
    public Address createAddress() {
        Address address1 = new Address();
        address1.setCity("city");
        address1.setCountry("county");
        address1.setStreet("street");
        return address1;
    }

    @Override
    public Address getAddress() {
        return createAddress();
    }
}
