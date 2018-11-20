package com.demo.common;



import javax.servlet.http.HttpServletRequest;

public class LoginToken {

	public static String getLoginToken(HttpServletRequest request) {
		String logname = CookieHelper.getCookieVal(request, Constants.USER_TOKEN);
		StringBuffer buffer = new StringBuffer();
		buffer.append(logname);
		buffer.append("|");
		buffer.append(request.getRemoteAddr());
		buffer.append("|");
		//buffer.append(SysProperties.getProperty("token.suffix"));
		return buffer.toString();
	}
}
