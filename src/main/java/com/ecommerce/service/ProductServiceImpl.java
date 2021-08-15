package com.ecommerce.service;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findTop8ByOrderByDateCreatedDesc() {
        return productRepository.findTop8ByOrderByDateCreatedDesc();
    }
}
