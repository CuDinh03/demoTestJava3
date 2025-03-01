package com.example.demotest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "KhachHangServlet", value = {"/KhachHangServlet", "/KhachHangServlet/delete"})
public class KhachHangServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        KhachHangDao dao = new KhachHangDao();
        List<KhachHang> list = dao.findAll();
        request.setAttribute("listKh", list);
        String uri = request.getRequestURI();
        if (uri.contains("delete")) {
            String username = request.getParameter("userName");
            dao.delete(username);
            response.sendRedirect("/KhachHangServlet");
        }
        request.getRequestDispatcher("/khachhang.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        KhachHangDao dao = new KhachHangDao();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String hoTen = request.getParameter("hoten");
        Boolean gioiTinh = Boolean.valueOf(request.getParameter("gioitinh"));
        String email = request.getParameter("email");

//        System.out.println(username + "-" + password + "-" + hoTen+ "-" + gioiTinh +"-" + email);

        KhachHang khachHang = new KhachHang();
        khachHang.setUserName(username);
        khachHang.setPassword(password);
        khachHang.setHoTen(hoTen);
        khachHang.setGioiTinh(gioiTinh);
        khachHang.setEmail(email);
        System.out.println(khachHang.toString());

        dao.insert(khachHang);
        response.sendRedirect("/KhachHangServlet");
    }
}