package com.kyeegroup.autotest.dao;

import com.kyeegroup.autotest.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lianghong on 09/12/2017.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {

}
