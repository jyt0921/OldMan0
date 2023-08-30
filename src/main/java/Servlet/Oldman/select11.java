package Servlet.Oldman;

import Bean.bean01;
import Bean.bean02;
import Dao.Odao;
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

@WebServlet(name = "select11", value = "/select11")
public class select11 extends HttpServlet {
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
        String name=request.getParameter("sum");
        System.out.println(name);
        Odao odao = new Odao();
      ArrayList<bean02> book = new ArrayList<bean02>();
        if(name.equals("男")||name.equals("女"))
        {
            try {
                odao.selectOld0(book,name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if (name.equals("汉族")||name.equals("少数民族"))
        {
            try {
                odao.selectOld1(book,name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if (name.equals("性别")||name.equals("文化程度")||name.equals("民族"))
        {
            System.out.println("111");
        }
        else
        {
            try {
                odao.selectOld2(book,name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
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
