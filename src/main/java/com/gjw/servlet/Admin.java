package com.gjw.servlet;

import com.gjw.bean.AdminInfo;
import com.gjw.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/admin")
public class Admin extends HttpServlet {
//
    @Autowired
    private AdminServiceImpl adminService;

    @Override
    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String acc = req.getParameter("acc");
        String pwd = req.getParameter("pwd");
        String verify = req.getParameter("verify");
        System.out.println(acc + ",,," + pwd);
        String adminVerify = (String) req.getSession().getAttribute("adminVerify");

        if (verify.equals(adminVerify)) {
            System.out.println("验证码正确");

            AdminInfo login = adminService.adminLogin(new AdminInfo(acc, pwd));
            System.out.println(login + "++++++");
            if (login != null) {
                if (acc.equals(login.getAcc()) && pwd.equals(login.getPwd())) {
                    System.out.println("登陆成功");
                    out.print("true");
//                    req.getRequestDispatcher("view/adminManage.jsp").forward(req, resp);
                } else {
                    System.out.println("登录失败");
                    out.print("false");
//                    resp.sendRedirect("view/admin.jsp?admin=false");

                }
            } else {

                out.print("noFind");
            }

        } else {
            out.print("false");
        }


    }
}
