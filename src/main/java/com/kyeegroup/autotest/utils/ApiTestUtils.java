package com.kyeegroup.autotest.utils;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;

import java.util.concurrent.ThreadPoolExecutor;

import static org.junit.Assert.assertTrue;

/**
 * Created by lianghong on 09/12/2017.
 */
public class ApiTestUtils {
    public static void runTest() {
        new Thread(() -> {
            Request simpleTest = Request.method(
                    ApiTestUtils.class, "simple_test");
            new JUnitCore().run(simpleTest);
        }).start();
    }

    @Test
    public void simple_test() {
        System.out.println("Called!");
        assertTrue(Boolean.TRUE);
    }

    public static void main(String[] args) {
        ApiTestUtils.runTest();
    }
}
