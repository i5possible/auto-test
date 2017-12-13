package com.kyeegroup.autotest.utils;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

import java.util.Collections;
import java.util.Map;
import java.util.stream.IntStream;

import static com.google.common.collect.Maps.newHashMap;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.Assert.assertTrue;

/**
 * @author lianghong
 * @date 09/12/2017
 */

public class ApiTestUtils {

    public static void runTest(String param) {
        Request simpleTest = Request.method(
                ApiTestUtils.class, "simple_test");
        new JUnitCore().run(simpleTest);
        System.out.println("线程：" + Thread.currentThread().getName() + " 执行参数为:" + param);
    }

    public static Result runGivenTest(String testName) {
        return new JUnitCore().run(Request.method(
                ApiTestUtils.class, testName));
    }

    @Test
    public void simple_test() {
        System.out.println("Called!");
        assertTrue(Boolean.TRUE);
    }

    @Test
    public void get_simple_test() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = Integer.parseInt("3000");
        // relaxed https
//        RestAssured.useRelaxedHTTPSValidation();
        Map<String, String> headers = Collections.emptyMap();
        Map<String, String> queries = Collections.emptyMap();
        Map<String, String> paths = newHashMap();
        paths.put("id", "1");
        String body = "";
        String api = "/comments/{id}";
        String jsonSchema = "schema/comment_json_schema.json";
        ValidatableResponse response = given().
                body(body).
                headers(headers).
                queryParams(queries).
                pathParams(paths).
                when().
                get(api).
                then().
                assertThat().
                body(matchesJsonSchemaInClasspath(jsonSchema))
                .statusCode(200);
        System.out.println("sucess!");
    }

    public static void main(String[] args) {
        IntStream.range(1, 10)
                .boxed()
                .map(Object::toString)
                .forEach(ApiTestUtils::runTest);
    }
}
