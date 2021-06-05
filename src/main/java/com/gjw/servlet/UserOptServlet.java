package com.gjw.servlet;

import com.gjw.bean.UserInfo;
import com.gjw.service.impl.RegisServiceImpl;
import com.gjw.service.impl.UserServiceImpl;
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
import java.util.List;


/**
 * @version 1.0
 * @author: gjw
 * @date: 2021/6/2 14:59
 * @desc:
 */
@WebServlet("/opt")
public class UserOptServlet extends HttpServlet {

//    @Autowired
//    private RegisServiceImpl regisService;
    @Autowired
    private UserServiceImpl userService;

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
        String action = req.getParameter("action");
        if (action.equals("regis")) {

        }else if (action.equals("login")){
            String acc = req.getParameter("acc");
            String pwd = req.getParameter("pwd");
            String verify = req.getParameter("verify");
            System.out.println(acc + ",,," + pwd+",,,"+verify);


            List<UserInfo> list = userService.selectUserInfo();
            System.out.println("--->"+list.size());
            req.getSession().setAttribute("userList", list);
            String serverVerify = (String) req.getSession().getAttribute("serviceVerify");
            if (verify.equals(serverVerify)) {
                System.out.println("验证码正确");
                UserInfo login = userService.isLogin(new UserInfo(acc, pwd));
                if (login != null) {
                    if (acc.equals(login.getAcc()) && pwd.equals(login.getPwd())) {
                        System.out.println("登陆成功");
                        out.print("loginTrue");
//                        req.getRequestDispatcher("jsp/index.jsp").forward(req, resp);
                    } else {
                        System.out.println("账号密码错误");
                        out.print("loginFalse");
//                        resp.sendRedirect("jsp/login.jsp?login=false");
                    }
                } else {
                    System.out.println("请注册");
                    resp.sendRedirect("jsp/login.jsp?login=false");
                }

            } else {
                resp.sendRedirect("jsp/login.jsp?login=false");
            }
        }


    }
}
