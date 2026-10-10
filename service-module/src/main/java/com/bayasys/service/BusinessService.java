
package com.bayasys.service;

import com.bayasys.user.UserService;
import com.bayasys.product.ProductService;

public class BusinessService {

    public void displayMessages() {
        UserService userService = new UserService();
        ProductService productService = new ProductService();

        System.out.println(userService.getUserMessage());
        System.out.println(productService.getProductMessage());
    }
}

