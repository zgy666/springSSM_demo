package com.demo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 支持跨域
 */
public class CrossFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Credentials","true");
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS,HEAD");
		httpServletResponse.setHeader("Access-Control-Max-Age", " 86400");
		httpServletResponse.setHeader("Access-Control-Allow-Headers", "X-Requested-With,X-PINGOTHER,Content-Type");
		chain.doFilter(request,httpServletResponse);
	}

	@Override
	public void destroy() {

	}
}
