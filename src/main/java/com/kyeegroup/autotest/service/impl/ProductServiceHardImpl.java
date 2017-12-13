package com.kyeegroup.autotest.service.Impl;

import com.kyeegroup.autotest.entity.Product;
import com.kyeegroup.autotest.repository.ProductRepository;
import com.kyeegroup.autotest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lianghong
 * @date 10/12/2017
 */

@Service(value = "ProductServiceHardImpl")
public class ProductServiceHardImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findOne(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public void deleteOne(Integer id) {
        productRepository.delete(id);
    }

    @Override
    public Product upInsertOne(Product product) {
        return productRepository.save(product);
    }
}
