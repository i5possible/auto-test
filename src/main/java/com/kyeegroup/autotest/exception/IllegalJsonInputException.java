package com.kyeegroup.autotest.exception;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author lianghong
 * @date 10/12/2017
 */
@NoArgsConstructor
public class IllegalJsonInputException extends Exception{

    public IllegalJsonInputException(String msg) {
        super(msg);
    }
}
