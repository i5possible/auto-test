package com.kyeegroup.autotest.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author lianghong
 * @date 13/12/2017
 */
@EqualsAndHashCode
@Getter
public class ParamEntry {
    private String key;
    private String value;
    private static final int count = 2;
    private static final String ASSIGNMENT_SPLIT_TOKEN = "=";

    private ParamEntry (String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static ParamEntry of(String assignmentString) {
        String[] paramArray = assignmentString.split(ASSIGNMENT_SPLIT_TOKEN);
        if (paramArray.length != count) {
            return new ParamEntry(null, null);
        }
        return new ParamEntry(paramArray[0], paramArray[1]);
    }

    public static boolean isLegalParamEntry(String assignmentString) {
        if (assignmentString.split(ASSIGNMENT_SPLIT_TOKEN).length == count) {
            return true;
        }
        return false;
    }
}
