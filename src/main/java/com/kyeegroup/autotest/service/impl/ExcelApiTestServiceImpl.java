package com.kyeegroup.autotest.service.Impl;

import com.kyeegroup.autotest.entity.ApiTestResult;
import com.kyeegroup.autotest.service.ApiTestService;
import org.springframework.stereotype.Service;

/**
 * @author lianghong
 * @date 13/12/2017
 */
@Service(value = "ExcelApiTestService")
public class ExcelApiTestServiceImpl implements ApiTestService {
    @Override
    public ApiTestResult runTests() {
        return null;
    }

    @Override
    public ApiTestResult runGetTest() {
        return null;
    }

    @Override
    public ApiTestResult runPostTest() {
        return null;
    }

    @Override
    public ApiTestResult runPutTest() {
        return null;
    }

    @Override
    public ApiTestResult runDeleteTest() {
        return null;
    }

    @Override
    public ApiTestResult runChainedTest() {
        return null;
    }

    @Override
    public void getToken() {

    }

    @Override
    public void setupEnvironment() {

    }

    @Override
    public void cleanEnvironment() {

    }
}
