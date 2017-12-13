package com.kyeegroup.autotest.entity;

import lombok.*;

import java.util.Map;

/**
 * @author lianghong
 * @date 13/12/2017
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiTestResult {
    private int total;
    private int success;
    private int failure;
    private int msg;
    private Map<Integer, String> failureMsgMap;
}
