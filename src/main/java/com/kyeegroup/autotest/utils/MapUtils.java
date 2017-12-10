package com.kyeegroup.autotest.utils;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.kyeegroup.autotest.exception.IllegalJsonInputException;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author lianghong
 * @date 10/12/2017
 */
public class MapUtils {
    public static Map<String, String> toStringMap(String json) throws IllegalJsonInputException {
        try {
             return new JsonParser().parse(json)
                    .getAsJsonObject()
                    .entrySet().stream()
                    .collect(Collectors.toMap( Map.Entry::getKey, set -> set.getValue().getAsString()));
        } catch (JsonSyntaxException e) {
            throw new IllegalJsonInputException("Illegal JsonSyntaxException");
        } catch (Exception e) {
            throw new IllegalJsonInputException("Illegal JsonInput!");
        }
    }
}
