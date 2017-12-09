package com.kyeegroup.autotest;

import com.kyeegroup.autotest.entity.ProductInfo;
import com.kyeegroup.autotest.repository.ProductInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author lianghong
 * @date 10/12/2017
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JpaConfigurationTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void getProduct() {
        ProductInfo one = productInfoRepository.findOne(1);
        assertThat(one.getProjectName()).isEqualTo("json-server");
    }
}
