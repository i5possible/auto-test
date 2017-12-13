package com.kyeegroup.autotest.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kyeegroup.autotest.entity.ParamEntry;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.google.common.collect.Maps.newHashMap;

/**
 * @author lianghong
 * @date 10/12/2017
 */
public class MapUtils {

    private static final String PARAM_SPLIT_TOKEN = "&";

    public static Map<String, String> jsonToMap(String json) {
        return new Gson().fromJson(json, new TypeToken<HashMap<String, String>>() {
        }.getType());
    }

    public static Map<String, String> cellValueToMap(Cell c) {
        if (Objects.isNull(c)) {
            return newHashMap();
        }
        String result = c.getRichStringCellValue().getString();
        if (StringUtils.isEmpty(result)) {
            return newHashMap();
        }
        return toMap(result);
    }

    private static Map<String, String> toMap(String string) {
        return Arrays.stream(string.split(PARAM_SPLIT_TOKEN))
                .filter(ParamEntry::isLegalParamEntry)
                .map(ParamEntry::of)
                .collect(Collectors.toMap(ParamEntry::getKey,ParamEntry::getValue));
    }
}
