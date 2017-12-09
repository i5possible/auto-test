package com.kyeegroup.autotest.utils;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author lianghong
 * @date 09/12/2017
 */

@EnableAsync
public class ApiTestUtils {

    public static void runTest(String param) {
        Request simpleTest = Request.method(
                ApiTestUtils.class, "simple_test");
        new JUnitCore().run(simpleTest);
        System.out.println("线程：" + Thread.currentThread().getName() + " 执行参数为:" + param);
    }

    @Test
    public void simple_test() {
        System.out.println("Called!");
        assertTrue(Boolean.TRUE);
    }

    public static void main(String[] args) {
        IntStream.range(1,10)
                .boxed()
                .map(Object::toString)
                .forEach(ApiTestUtils::runTest);
    }
}
