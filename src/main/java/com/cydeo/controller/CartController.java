package com.cydeo.controller;

import com.cydeo.model.Cart;
import com.cydeo.model.CartItem;
import com.cydeo.service.CartService;
import com.cydeo.service.impl.CartServiceImpl;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class CartController {

    @RequestMapping("/cart-list")
    public String cartList(CartServiceImpl cartService, Model model){

        List<Cart> cartList = cartService.retrieveCartList();

        model.addAttribute("cartList",cartList);

        return "/cart/cart-list";
    }

    @RequestMapping("/cart-list/{cartId}")
    public String cartDetails(@PathVariable UUID cartId, CartServiceImpl cartService, Model model){

        List<CartItem> cartItemList = cartService.retrieveCartDetail(cartId);

        model.addAttribute("cartItemList",cartItemList);

        return "cart/cart-detail";
    }

}
