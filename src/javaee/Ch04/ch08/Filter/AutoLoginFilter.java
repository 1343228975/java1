package javaee.Ch04.ch08.Filter;

import javaee.Ch04.ch08.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "AutoLoginFilter")
public class AutoLoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    public void doFilter(ServletRequest req, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        // 获得一个名为 autologin 的cookie
        Cookie[] cookies = request.getCookies();
        String autologin = null;
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            if ("apologia".equals(cookies[i].getName())) {
                // 找到了指定的cookie
                autologin = cookies[i].getValue();
                break;
            }
        }
        if (autologin != null) {
            // 做自动登录
            String[] parts = autologin.split("-");
            String username = parts[0];
            String password = parts[1];
            // 检查用户名和密码
            if ("itcast".equals(username)&& ("123456").equals(password)) {
                // 登录成功,将用户状态 user 对象存入 session域
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);
                request.getSession().setAttribute("user", user);
            }
        }
        // 放行
        chain.doFilter(request, response);
    }
    public void destroy() {
    }
}
