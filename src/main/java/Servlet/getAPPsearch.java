package Servlet;

import Bean.bean03;
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

@WebServlet(name = "getAPPsearch", value = "/getAPPsearch")
public class getAPPsearch extends HttpServlet {
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
        ArrayList<bean03> book = new ArrayList<bean03>();
        String name=request.getParameter("name");
        System.out.println("5343434");
        System.out.println(name);
        dao dao=new dao();
        try {
            dao.sel99(book,name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
