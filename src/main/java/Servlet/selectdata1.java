package Servlet;

import Bean.bean01;
import Bean.bean04;
import Dao.dao;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "selectdata1", value = "/selectdata1")
public class selectdata1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        String idcard1=request.getParameter("idcard1");
        ArrayList<bean04> book = new ArrayList<bean04>();
        dao dao=new dao();
        try {
            dao.selectdata1(book,idcard1);
            System.out.println("1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("2");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("3");
        }
        System.out.println("*****************");
        String json = JSON.toJSONString(book);
        response.getWriter().write(json);
    }
}
