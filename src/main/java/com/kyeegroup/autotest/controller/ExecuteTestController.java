package com.kyeegroup.autotest.controller;

import com.kyeegroup.autotest.utils.ApiTestUtils;
import org.junit.runner.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @author lianghong
 * @date 10/12/2017
 */
@RequestMapping(path = "/execute/tests")
@RestController
public class ExecuteTestController {

    @PostMapping(path = "/{id}")
    public void fireTest(@PathVariable Integer id) {
        ApiTestUtils.runTest("" + id);
    }

    @GetMapping(path = "/get")
    public Result fireTestGet() {
        return ApiTestUtils.runGivenTest("get_simple_test");
    }
}
