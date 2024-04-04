package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.service.CartService;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CartController {

    @RequestMapping("/cart-list")
    public String cartList(ProductServiceImpl productService, CartServiceImpl cartService, Model model){

        productService.initialiseProductList();
        cartService.initialiseCartList();

        List<Cart> cartList = cartService.retrieveCartList();

        model.addAttribute("cartList",cartList);

        return "/cart/cart-list";
    }

}
