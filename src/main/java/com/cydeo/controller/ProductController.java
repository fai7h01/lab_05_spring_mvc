package com.cydeo.controller;

import com.cydeo.model.Product;
import com.cydeo.service.impl.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @RequestMapping("/search-product/{productName}")
    public String searchProduct(@PathVariable String productName, ProductServiceImpl productService, Model model){

        List<Product> productList = productService.searchProduct(productName);
        model.addAttribute("productList",productList);

        return "product/product-list";
    }

}
