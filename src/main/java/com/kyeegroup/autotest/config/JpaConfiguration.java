package com.kyeegroup.autotest.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author lianghong
 * @date 10/12/2017
 */
@EntityScan("com.kyeegroup.autotest.entity")
@EnableJpaRepositories(basePackages={"com.kyeegroup.autotest.repository"})
public class JpaConfiguration {
}
