package com.kyeegroup.autotest.controller;

import com.kyeegroup.autotest.entity.Product;
import com.kyeegroup.autotest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lianghong
 * @date 10/12/2017
 */
@RequestMapping(path = "/product")
@RestController
public class ProductController {

    @Autowired
    @Qualifier(value = "productServiceHardImpl")
    private ProductService productService;

    @GetMapping(path = "/{productInfo}")
    public Product getProductInfo(@PathVariable Integer productInfo){
        return productService.findOne(productInfo);
    }
}
