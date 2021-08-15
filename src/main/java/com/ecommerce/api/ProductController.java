package com.ecommerce.api;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.model.entity.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController extends ApiController{

    private final ProductRepository productService;

    @Autowired
    public ProductController(ProductRepository productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/product")
    public List<Product> getAll(){
        return denemeProduct();
    }

    public List<Product> denemeProduct(){
        return productService.findTop8ByOrderByDateCreatedDesc();
    }

}
