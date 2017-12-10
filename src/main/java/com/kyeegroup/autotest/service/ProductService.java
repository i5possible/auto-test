package com.kyeegroup.autotest.service;

import com.kyeegroup.autotest.entity.Product;
import org.springframework.stereotype.Service;

/**
 * @author lianghong
 * @date 10/12/2017
 */

@Service
public interface ProductService {
    Product findOne(Integer id);

    void deleteOne(Integer id);

    Product upInsertOne(Product product);
}
