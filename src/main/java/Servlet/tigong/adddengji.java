package Servlet.tigong;

import Bean.bean01;
import Dao.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@WebServlet(name = "adddengji", value = "/adddengji")
public class adddengji extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");//设置字符集
        System.out.println("11");
        String tigongname=request.getParameter("tigongname");
        String guanxi=request.getParameter("guanxi");
        String IDcard=request.getParameter("IDcard");
        String name=request.getParameter("oname");
        String phone=request.getParameter("phone");
        System.out.println(IDcard);
        System.out.println(name);
        bean01 bean01 = new bean01();
        bean01.setTigongname(tigongname);
        bean01.setName(name);
        bean01.setGuanxi(guanxi);
        bean01.setIDcard(IDcard);
        bean01.setName(name);
        bean01.setPhone(phone);
        dao dao = new dao();
        try {
            dao.adddengji0(bean01);
            dao.adddengji1(bean01);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        response.getWriter().print("ok");
    }
}
