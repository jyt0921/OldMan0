package Servlet.pinggu;

import Bean.bean04;
import Bean.bean05;
import Dao.Pdao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "addjingshen", value = "/addjingshen")
public class addjingshen extends HttpServlet {
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
        String renzhi=request.getParameter("renzhi");
        String gongji=request.getParameter("gongji");
        String yiyu=request.getParameter("yiyu");
        String jinsheng="";
        String jinshenfenji="";
        int zonghe= Integer.parseInt(renzhi)+Integer.parseInt(gongji)+Integer.parseInt(yiyu);
        System.out.println(zonghe);
        String sumrichang0=""+zonghe;
        if(zonghe==0)
        {
            jinshenfenji="能力完好";
        }
        else if (zonghe==1)
        {
            jinshenfenji="轻度受损";
        }
        else if (zonghe>=2&&zonghe<3)
        {
            jinshenfenji="中度受损";
        }
        else
        {
            jinshenfenji="重度受损";
        }
        bean05 a = new bean05();
        a.setName(name);
        a.setIdcard(identity);
        a.setRenzhi(renzhi);
        a.setGongji(gongji);
        a.setYiyu(yiyu);
        a.setJinsheng(sumrichang0);
        a.setJinshenfenji(jinshenfenji);
        Pdao pdao = new Pdao();
        try {
            pdao.addjingshen0(a);
            pdao.updatejinshen(a);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("index11.html").forward(request, response);
    }
}
