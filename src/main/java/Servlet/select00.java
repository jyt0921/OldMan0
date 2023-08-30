package Servlet;

import Bean.bean01;
import Bean.bean04;
import Dao.dao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "select00", value = "/select00")
public class select00 extends HttpServlet {
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
        String name11=request.getParameter("name11");
        System.out.println("select00");
        System.out.println(name11);
        ArrayList<bean04> book = new ArrayList<bean04>();
        dao dao=new dao();
        try {
            dao.selectZid(book,name11);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("1111");
        int count1=book.size();
        String count=""+count1;
        Map<String,Object> result=new HashMap<String,Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",count);
        result.put("data",book);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString (result);
        System.out.println(json);
        response.getWriter().print(json.toString());  //传递json给后端
    }
}
