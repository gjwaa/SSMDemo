package com.gjw.filter;


import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/4 10:45
 * @desc:
 */
public class LoginFilter implements Filter {
    private static final String LOGON_URI = "LOGON_URI";

    private static final String REGISTER_URI = "REGISTER_URI";

    private String logon_page;

    private String register_page;

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        req.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = req.getSession();
        // PrintWriter out = resp.getWriter();
        // 得到用户请求的URI
        String request_uri = req.getRequestURI();
        // 得到web应用程序的上下文路径
        String ctxPath = req.getContextPath();
        // 去除上下文路径，得到剩余部分的路径
        String uri = request_uri.substring(ctxPath.length());
        // 判断用户访问的是否是登录页面
        if (uri.equals(logon_page) || uri.equals(register_page)) {
            chain.doFilter(request, response);
            return;
        } else {
            // 如果访问的不是登录页面，则判断用户是否已经登录
            if (null != session.getAttribute("curUser")
                    && "" != session.getAttribute("curUser")) {
                chain.doFilter(request, response);
                return;
            } else {
                String msg = "您未登录！";
                String url = "Errorer";
                req.setAttribute("err", msg);
                req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);

//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Servlet Error</title>");
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<h2 align=center>" + request.getAttribute("err") + "</h2>");
//                response.getWriter().write("请登录！页面将在3秒后自动跳转，如果没有，请点击<a href='jsp/login.jsp'>回到登录页面</a>");
//                out.println("</body>");
//                out.println("</html>");

            }
            //out.println("<script language=/"javaScript/">"
            // + "parent.location.href='" +

            //ctxPath + logon_page + "'"
            //  + "</script>");
            // return;
            // }
        }
    }

    public void init(FilterConfig config) throws ServletException {
        // TODO Auto-generated method stub
        // 从部署描述符中获取登录页面和首页的URI
        logon_page = config.getInitParameter(LOGON_URI);
        register_page = config.getInitParameter(REGISTER_URI);
        // System.out.println(logon_page);
        if (null == logon_page || null == register_page) {
            throw new ServletException("没有找到登录页面或主页");
        }
    }


}