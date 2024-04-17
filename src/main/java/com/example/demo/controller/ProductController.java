package com.example.demo.controller;

import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/product")
        public class ProductController {

    // https://fakestoreapi.com/products

    @GetMapping("/{id}/{temp}")
    public String getProductById(@PathVariable ("id") Long id, @PathVariable("temp") String x)
    {
        return "Here's your product "+ id+x;
    }
    @GetMapping("/{id}")
    public String getProductById(@PathVariable ("id") Long id)
    {
        return "Here's your Product " + id;
    }
    @PostMapping()
    public String createProduct(@RequestBody Product product)
    {
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product Created";
    }
}