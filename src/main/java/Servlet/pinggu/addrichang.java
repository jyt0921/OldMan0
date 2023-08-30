package Servlet.pinggu;

import Bean.bean01;
import Bean.bean04;
import Dao.Pdao;
import Dao.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@WebServlet(name = "addrichang", value = "/addrichang")
public class addrichang extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");//设置字符集
        String name=request.getParameter("name");
        String identity=request.getParameter("identity");
        String jinshi=request.getParameter("jinshi");
        String xizao=request.getParameter("xizao");
        String xiushi=request.getParameter("xiushi");
        String chuanyi=request.getParameter("chuanyi");
        String dabiankongzhi=request.getParameter("dabiankongzhi");
        String xiaobiankongzhi=request.getParameter("xiaobiankongzhi");
        String ruce=request.getParameter("ruce");
        String chuangyizhuanyi=request.getParameter("chuangyizhuanyi");
        String pingdixingzou=request.getParameter("pingdixingzou");
        String shangxialouti=request.getParameter("shangxialouti");
        String richangfenji="";
        System.out.println(shangxialouti);
        int zonghe= Integer.parseInt(shangxialouti)+Integer.parseInt(pingdixingzou)+Integer.parseInt(chuangyizhuanyi)+Integer.parseInt(ruce)+Integer.parseInt(jinshi)+Integer.parseInt(xizao)+Integer.parseInt(xiushi)+Integer.parseInt(chuanyi)+Integer.parseInt(dabiankongzhi)+Integer.parseInt(xiaobiankongzhi);
        System.out.println(zonghe);
        String sumrichang0=""+zonghe;
        if(zonghe>=95)
        {
            richangfenji="能力完好";
        }
        else if (zonghe>=65&&zonghe<95)
        {
            richangfenji="轻度受损";
        }
        else if (zonghe>=45&&zonghe<65)
        {
            richangfenji="中度受损";
        }
        else
        {
            richangfenji="重度受损";
        }
        bean04 a = new bean04();
        a.setName(name);
        a.setIdcard(identity);
        a.setJingshi(jinshi);
        a.setXizao(xizao);
        a.setXiushi(xiushi);
        a.setChuanyi(chuanyi);
        a.setDabian(dabiankongzhi);
        a.setXiaobian(xiaobiankongzhi);
        a.setRuce(ruce);
        a.setChuangyizhuanyi(chuangyizhuanyi);
        a.setPingdixingzou(pingdixingzou);
        a.setShangxialouti(shangxialouti);
        a.setSumrichang(sumrichang0);
        a.setRichangfenji(richangfenji);
        Pdao pdao = new Pdao();
        try {
            pdao.addrichang0(a);
            pdao.updaterichang(a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
