package com.brainacad.product;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> products;

    List<Product> findAll() {
        return this.products;
    }

}
