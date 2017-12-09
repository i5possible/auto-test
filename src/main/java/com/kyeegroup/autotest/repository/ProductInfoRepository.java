package com.kyeegroup.autotest.repository;

import com.kyeegroup.autotest.entity.ProductInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author lianghong
 * @date 09/12/2017
 */

@Component
public interface ProductInfoRepository extends CrudRepository<ProductInfo, Integer> {

}
