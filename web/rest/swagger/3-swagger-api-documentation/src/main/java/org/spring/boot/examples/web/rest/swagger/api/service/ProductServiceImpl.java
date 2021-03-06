package org.spring.boot.examples.web.rest.swagger.api.service;

import org.spring.boot.examples.web.rest.swagger.api.controller.dto.Products;
import org.spring.boot.examples.web.rest.swagger.api.entity.ProductEntity;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService, InitializingBean {

    private List<ProductEntity> products;

    @Override
    public ProductEntity findById(String id) {

        return products.stream()
                .filter(productEntity -> id.equals(productEntity.getProductId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void create(ProductEntity productEntity) {

        products.add(productEntity);
    }

    @Override
    public boolean removeOne(String id) {

        return products.removeIf(productEntity -> id.equals(productEntity.getProductId()));
    }

    @Override
    public void removeAll() {

        products.clear();
    }

    @Override
    public Products findAll() {

        //we will return a copy of our products
        return new Products().addProducts(new ArrayList<>(products));
    }

    @Override
    public boolean update(String id, ProductEntity productEntity) {

        int index = products.indexOf(productEntity);
        if (index == -1) {
            return false;
        } else {
            products.set(index, productEntity);
            return true;
        }
    }

    @Override
    public void afterPropertiesSet() {

        products = new ArrayList<>();
        products.add(
                new ProductEntity()
                        .setProductId("A1598")
                        .setDescription("HP Computer")
                        .setPrice(new BigDecimal(670))
        );
    }
}
