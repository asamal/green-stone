package com.samal.greenstone.core.api.dto;

import com.samal.greenstone.core.api.FieldTooLongException;
import com.samal.greenstone.core.api.FieldTooShortException;
import org.springframework.stereotype.Component;

@Component
public class StringChecker {

    public static String withLengthLimit(String input, String fieldName, int min, int max) {
        if (input != null) {
            if (input.length() > max)
                throw new FieldTooLongException(fieldName, max);
            if (input.length() < min)
                throw new FieldTooShortException(fieldName, min);
        }
        return input;
    }
}
