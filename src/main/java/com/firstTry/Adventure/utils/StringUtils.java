package com.firstTry.Adventure.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 * 
 * @author Roger
 *
 */
public class StringUtils {
	/**
	 * 判断字符是否为空
	 * 
	 * @param cs
	 * @return
	 */
	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}
	/*
	 * 校验字符串是否含有中文
	 */
	public static boolean isContainChinese(String... str) {
		for (int a = 0; a < str.length; a++) {
			Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
			Matcher m = p.matcher(str[a]);
			if (m.find())
				return true;
		}
		return false;
	}
	/*
	 * 校验字符串是否为空
	 */
	public static boolean stringIsNull(String... str) {
		for (int a = 0; a < str.length; a++) {
			if (isEmpty(str[a]))
				return true;
		}
		return false;
	}
}
