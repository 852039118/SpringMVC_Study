package com.warren.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
//<filter>
//<filter-name>encoding</filter-name>
//<filter-class>com.warren.filter.EncodingFilter</filter-class>
//</filter>
//<filter-mapping>
//<filter-name>encoding</filter-name>
//<url-pattern>/*</url-pattern>
//    </filter-mapping>
