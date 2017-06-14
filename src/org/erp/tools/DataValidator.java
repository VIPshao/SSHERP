package org.erp.tools;

import java.util.regex.Pattern;

public class DataValidator {

    public static boolean isNullOrEmpty(String input) {
	return "".equals(input) || input == null;
    }

    public static boolean regexMatch(String input, String pattern) {
	if (isNullOrEmpty(input)) {
	    return false;
	}
	return Pattern.compile(pattern).matcher(input).matches();
    }

}
