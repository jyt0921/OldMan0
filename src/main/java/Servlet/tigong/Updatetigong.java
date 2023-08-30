package Servlet.tigong;

import Bean.bean01;
import Dao.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Updatetigong", value = "/Updatetigong")
public class Updatetigong extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.setCharacterEncoding("utf-8");
        //������Ӧ���ı�����
        response.setContentType("text/html;charset=utf-8");//设置字符集
        String tigongname=request.getParameter("tigongname");
        String guanxi = request.getParameter("guanxi");
        String	name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String	IDcard = request.getParameter("IDcard");
        dao dao=new dao();
        System.out.println(tigongname);
        bean01 A=new bean01();
        A.setTigongname(tigongname);
        A.setGuanxi(guanxi);
        A.setName(name);
        A.setPhone(phone);
        A.setIDcard(IDcard);
        try {
            dao.updateT(A);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.getWriter().print("ok");
    }
}
