package com.demo.common;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieHelper {
	private static Integer COOKIE_MAX_AGE = 1000 * 60 * 60 * 24 * 7;

	/**
	 * 
	 * <p>
	 * Discription:[添加cookie,默认有效期7天]
	 * </p>
	 */
	public static void setCookie(HttpServletResponse response, String name, String value) {
		setCookie(response, name, value, COOKIE_MAX_AGE);
	}

	/**
	 * 
	 * <p>
	 * Discription:[添加回家机制的cookie]
	 * </p>
	 */
	public static void setDialogCookie(HttpServletResponse response, String name, String value) {
		if (value == null)
			value = "";

		@SuppressWarnings("deprecation")
		Cookie cookie = new Cookie(name, URLEncoder.encode(value));
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	/**
	 * 
	 * <p>
	 * Discription:[添加cookie，并指定有效期]
	 * </p>
	 */
	@SuppressWarnings("deprecation")
	public static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
		if (value == null)
			value = "";

		Cookie cookie = new Cookie(name, URLEncoder.encode(value));
		if (maxAge != 0) {
			cookie.setMaxAge(maxAge);
		} else {
			cookie.setMaxAge(COOKIE_MAX_AGE);
		}
		cookie.setPath("/");
		response.addCookie(cookie);
	}

	/**
	 * 
	 * <p>
	 * Discription:[获得制定的cookie]
	 * </p>
	 */
	public static Cookie getCookie(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();

		if (cookies != null) {
			for (Cookie c : cookies) {
				if (name.equals(c.getName()))
					return c;
			}
		}
		return null;
	}

	/**
	 * 
	 * <p>
	 * Discription:[获得制定cookie值]
	 * </p>
	 */
	@SuppressWarnings("deprecation")
	public static String getCookieVal(HttpServletRequest request, String name) {
		Cookie cookie = getCookie(request, name);
		return cookie == null ? "" : URLDecoder.decode(cookie.getValue());
	}

	/**
	 * 
	 * <p>
	 * Discription:[删除制定cookie]
	 * </p>
	 */
	public static void delCookie(HttpServletRequest request, HttpServletResponse response, String name) {
		Cookie cookie = getCookie(request, name);
		if (cookie != null) {
			cookie.setValue("");
			cookie.setMaxAge(0);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
	}
}
