package Servlet.Oldman;

import Bean.bean01;
import Bean.bean02;
import Dao.Odao;
import Dao.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "addoldmaninfo", value = "/addoldmaninfo")
public class addoldmaninfo extends HttpServlet {
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
        String sex=request.getParameter("sex");
        String date=request.getParameter("date");
        String identity=request.getParameter("identity");
        String shebao=request.getParameter("shebao");
        String mingzu=request.getParameter("mingzu");
        String wenhua=request.getParameter("wenhua");
        String zongjiao=request.getParameter("zongjiao");
        String hunyan=request.getParameter("hunyan");
        String juzhu=request.getParameter("juzhu");
        String jingji=request.getParameter("jingji");
        String chidai=request.getParameter("chidai");
        String zhifu=request.getParameter("zhifu");
        String jingshen=request.getParameter("jingshen");
        String diedao=request.getParameter("diedao");
        String zoushi=request.getParameter("zoushi");
        String yeshi=request.getParameter("yeshi");
        String zisha=request.getParameter("zisha");
        String qita="无";
        System.out.println(zoushi);
        System.out.println(zhifu);
        bean02 bean02 = new bean02();
        bean02.setName(name);
        bean02.setSex(sex);
        bean02.setChusheng(date);
        bean02.setIDcard(identity);
        bean02.setShebao(shebao);
        bean02.setMingzu(mingzu);
        bean02.setWenhuachengdu(wenhua);
        bean02.setZongjiao(zongjiao);
        bean02.setHunyan(hunyan);
        bean02.setJuzhu(juzhu);
        bean02.setZhifufangshi(zhifu);
        bean02.setJingjilaiyuan(jingji);
        bean02.setChidai(chidai);
        bean02.setJingshenjibing(jingshen);
        bean02.setManxingjibing("0");
        bean02.setDiedao(diedao);
        bean02.setZoushi(zoushi);
        bean02.setYeshi(yeshi);
        bean02.setZisha(zisha);
        bean02.setQita(qita);
        Odao dao = new Odao();
        try {
        dao.addoldmaninfo1(bean02);
        dao.updateinfo0(bean02);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
