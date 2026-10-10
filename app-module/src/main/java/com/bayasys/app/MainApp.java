
package com.bayasys.app;

import com.bayasys.service.BusinessService;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("=== Maven Enterprise Demo ===");

        BusinessService businessService = new BusinessService();
        businessService.displayMessages();

        System.out.println("=== Application Completed ===");
    }
}

