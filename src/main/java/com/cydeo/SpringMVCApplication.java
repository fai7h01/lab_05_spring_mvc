package com.cydeo;

import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMVCApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringMVCApplication.class, args);

        ProductServiceImpl productService = context.getBean(ProductServiceImpl.class);
        CartServiceImpl cartService = context.getBean(CartServiceImpl.class);

        productService.initialiseProductList();
        cartService.initialiseCartList();

    }

}
