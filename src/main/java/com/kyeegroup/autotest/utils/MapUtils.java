package com.kyeegroup.autotest.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lianghong
 * @date 10/12/2017
 */
public class MapUtils {

    public static Map<String, String> jsonToMap(String json) {
        return new Gson().fromJson(json, new TypeToken<HashMap<String, String>>() { }.getType());
    }
}
