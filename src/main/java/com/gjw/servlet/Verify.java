package com.gjw.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/verify")
public class Verify extends HttpServlet {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 30;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        resp.setContentType("image/jpeg");
        BufferedImage img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = img.getGraphics();
        setBk(g);
        setBorder(g);
        drawLine(g);
        String verify = drawVerify(g);
        System.out.println(verify);
        req.getSession().setAttribute("serviceVerify", verify);
        req.getSession().setAttribute("adminVerify", verify);
        resp.setHeader("Pragma","no-cache");
        resp.setHeader("Cache-Control","no-cache");
        ImageIO.write(img, "JPG", resp.getOutputStream());

    }

    private void setBk(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }

    private void setBorder(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawRect(1, 1, WIDTH - 2, HEIGHT - 2);
    }

    private void drawLine(Graphics g) {
        g.setColor(Color.ORANGE);
        for (int i = 0; i < 5; i++) {
            int x1 = new Random().nextInt(WIDTH);
            int y1 = new Random().nextInt(HEIGHT);
            int x2 = new Random().nextInt(WIDTH);
            int y2 = new Random().nextInt(HEIGHT);
            g.drawLine(x1, y1, x2, y2);
        }
    }

    private String drawVerify(Graphics g) {
        g.setColor(Color.red);
        g.setFont(new Font("宋体", Font.PLAIN, 18));
        String verify = "23456789qwertyupasdfghjkzxcvbnm";
        StringBuffer sb = new StringBuffer();
        int x = 15;
        for (int i = 0; i < 4; i++) {
            String s = verify.charAt(new Random().nextInt(verify.length())) + "";
            sb.append(s);
            g.drawString(s, x, 20);
            x += 20;
        }
        return sb.toString();
    }


}
