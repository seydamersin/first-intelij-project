package com.muates.example1.srp.service;

import com.muates.example1.srp.model.Address;
import com.muates.example1.srp.model.Bakiye;
import com.muates.example1.srp.model.Product;
import com.muates.example1.srp.model.User;

public class CartServiceImpl implements ICartService {

    private final IUserService userService;
    private final IProductService productService;
    private final IAddressService addressService;
    private final IBakiyeService bakiyeService;

    public CartServiceImpl(IUserService userService, IProductService productService, IAddressService addressService,
                           IBakiyeService bakiyeService) {
        this.userService = userService;
        this.productService = productService;
        this.addressService = addressService;
        this.bakiyeService = bakiyeService;
    }

    @Override
    public String checkout() {
        User user = userService.getUser();
        Product product = productService.getProduct();
        Address address = addressService.getAddress();
        Bakiye bakiye = bakiyeService.getBakiye();

        if (user == null || product == null || address == null)
            throw new IllegalStateException();

        if (bakiye.getBakiye() < product.getPrice())
            throw new IllegalStateException();

        return "Kullanıcı: " + user.getUsername() + "/n" +
                "Şu ürünü: " + product.getProductName() + "/n" +
                "Şu fiyata" + product.getPrice() + "başarılı bir şekilde aldı";
    }
}
