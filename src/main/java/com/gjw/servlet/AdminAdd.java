package com.gjw.servlet;

import com.gjw.bean.ProductInfo;
import com.gjw.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet(name = "AdminAdd", urlPatterns = "/adminAdd")
@MultipartConfig(location = "D://")
public class AdminAdd extends HttpServlet {

    @Autowired
    private ProductServiceImpl productService;

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
        String name = req.getParameter("name");
        String startPrice = req.getParameter("startPrice");
        String type = req.getParameter("type");
        String introduce = req.getParameter("introduce");

        Part loadFile = req.getPart("loadFile");
        String fileName = loadFile.getSubmittedFileName();
        loadFile.write("D://load//" + fileName);
        System.out.println("loadFile:" + fileName);

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductName(name);
        productInfo.setStartPrice(startPrice);
        productInfo.setProductTypeID(Integer.valueOf(type));
        productInfo.setProductImg(fileName);
        productInfo.setIntroduce(introduce);

        productService.addProduce(productInfo);


<<<<<<< HEAD

=======
>>>>>>> 73eeb70761e8e36ef979b5dae18272fc1be5a030
    }
}
