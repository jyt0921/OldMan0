package Servlet.tigong;

import Bean.bean01;
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

@WebServlet(name = "selecttigong", value = "/selecttigong")
public class selecttigong extends HttpServlet {
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
        String name=request.getParameter("name");
        System.out.println(name);
        String phone=request.getParameter("phone");
        String idcard=request.getParameter("idcard");
        System.out.println(idcard);
        System.out.println(phone);
        ArrayList<bean01> book = new ArrayList<bean01>();
        dao dao=new dao();
        if(phone.equals(" "))
        {
            try {
                dao.selectTName(book,name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                dao.selectTPhone(book,phone);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
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
//	    	request.getRequestDispatcher("showall0.html").forward(request, response);


    }
}
