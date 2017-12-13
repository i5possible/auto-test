package com.kyeegroup.autotest.service;

import com.kyeegroup.autotest.entity.ApiTestResult;
import io.swagger.annotations.Api;
import org.junit.runner.Result;
import org.springframework.stereotype.Service;

/**
 * @author lianghong
 * @date 13/12/2017
 */
@Service
public interface ApiTestService {

    /**
     *
     * @return
     */
    ApiTestResult runTests();

    ApiTestResult runGetTest();

    ApiTestResult runPostTest();

    ApiTestResult runPutTest();

    ApiTestResult runDeleteTest();

    ApiTestResult runChainedTest();

    void getToken();

    void setupEnvironment();

    void cleanEnvironment();


}
