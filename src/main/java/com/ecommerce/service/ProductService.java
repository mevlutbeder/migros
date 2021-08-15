package com.ecommerce.service;

import com.ecommerce.model.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findTop8ByOrderByDateCreatedDesc();

}
