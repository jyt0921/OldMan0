package Dao;

import Bean.bean01;
import Bean.bean02;
import Bean.bean03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Odao {
    public void selectOld0(ArrayList<bean02> book, String name) throws ClassNotFoundException, SQLException {
        String sql1="select * from information where  sex= ?";
        System.out.println(name);
        System.out.println("11111111");
        PreparedStatement pre=null;
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,name);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean02 A=new bean02();
            A.setName(rs.getString(1));
            A.setSex(rs.getString(2));
            A.setChusheng(rs.getString(3));
            A.setIDcard(rs.getString(4));
            A.setShebao(rs.getString(5));
            A.setMingzu(rs.getString(6));
            A.setWenhuachengdu(rs.getString(7));
            A.setZongjiao(rs.getString(8));
            A.setHunyan(rs.getString(9));
            A.setJuzhu(rs.getString(10));
            A.setZhifufangshi(rs.getString(11));
            A.setJingjilaiyuan(rs.getString(12));
            A.setChidai(rs.getString(13));
            A.setJingshenjibing(rs.getString(14));
            A.setManxingjibing(rs.getString(15));
            A.setDiedao(rs.getString(16));
            A.setZoushi(rs.getString(17));
            A.setYeshi(rs.getString(18));
            A.setZisha(rs.getString(19));
            A.setQita(rs.getString(20));
            book.add(A);
        }
    }
    public void selectOld1(ArrayList<bean02> book, String name) throws ClassNotFoundException, SQLException {
        String sql1="select * from information where  mingzu= ?";
        System.out.println(name);
        System.out.println("11111111");
        PreparedStatement pre=null;
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,name);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean02 A=new bean02();
            A.setName(rs.getString(1));
            A.setSex(rs.getString(2));
            A.setChusheng(rs.getString(3));
            A.setIDcard(rs.getString(4));
            A.setShebao(rs.getString(5));
            A.setMingzu(rs.getString(6));
            A.setWenhuachengdu(rs.getString(7));
            A.setZongjiao(rs.getString(8));
            A.setHunyan(rs.getString(9));
            A.setJuzhu(rs.getString(10));
            A.setZhifufangshi(rs.getString(11));
            A.setJingjilaiyuan(rs.getString(12));
            A.setChidai(rs.getString(13));
            A.setJingshenjibing(rs.getString(14));
            A.setManxingjibing(rs.getString(15));
            A.setDiedao(rs.getString(16));
            A.setZoushi(rs.getString(17));
            A.setYeshi(rs.getString(18));
            A.setZisha(rs.getString(19));
            A.setQita(rs.getString(20));
            book.add(A);
        }
    }

    public void selectOld2(ArrayList<bean02> book, String name) throws ClassNotFoundException, SQLException {
        String sql1="select * from information where  wenhuachengdu= ?";
        System.out.println(name);
        System.out.println("11111111");
        PreparedStatement pre=null;
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,name);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean02 A=new bean02();
            A.setName(rs.getString(1));
            A.setSex(rs.getString(2));
            A.setChusheng(rs.getString(3));
            A.setIDcard(rs.getString(4));
            A.setShebao(rs.getString(5));
            A.setMingzu(rs.getString(6));
            A.setWenhuachengdu(rs.getString(7));
            A.setZongjiao(rs.getString(8));
            A.setHunyan(rs.getString(9));
            A.setJuzhu(rs.getString(10));
            A.setZhifufangshi(rs.getString(11));
            A.setJingjilaiyuan(rs.getString(12));
            A.setChidai(rs.getString(13));
            A.setJingshenjibing(rs.getString(14));
            A.setManxingjibing(rs.getString(15));
            A.setDiedao(rs.getString(16));
            A.setZoushi(rs.getString(17));
            A.setYeshi(rs.getString(18));
            A.setZisha(rs.getString(19));
            A.setQita(rs.getString(20));
            book.add(A);
        }
    }
    public void showold(ArrayList<bean02> book) throws ClassNotFoundException, SQLException {
        String sql1="select * from information";
        System.out.println("chen1");
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean02 A=new bean02();
            A.setName(rs.getString(1));
            A.setSex(rs.getString(2));
            A.setChusheng(rs.getString(3));
            A.setIDcard(rs.getString(4));
            A.setShebao(rs.getString(5));
            A.setMingzu(rs.getString(6));
            A.setWenhuachengdu(rs.getString(7));
            A.setZongjiao(rs.getString(8));
            A.setHunyan(rs.getString(9));
            A.setJuzhu(rs.getString(10));
            A.setZhifufangshi(rs.getString(11));
            A.setJingjilaiyuan(rs.getString(12));
            A.setChidai(rs.getString(13));
            A.setJingshenjibing(rs.getString(14));
            A.setManxingjibing(rs.getString(15));
            A.setDiedao(rs.getString(16));
            A.setZoushi(rs.getString(17));
            A.setYeshi(rs.getString(18));
            A.setZisha(rs.getString(19));
            A.setQita(rs.getString(20));

            book.add(A);
        }
    }

    public void addoldmaninfo1(bean02 A) throws ClassNotFoundException, SQLException {
        Connection connection = Util.util.getConnection();
        String sql = "INSERT INTO information (name, sex, chusheng, IDcard, shebao, mingzu,wenhuachengdu, zongjiao, hunyan, juzhu, zhifufangshi, jingjilaiyuan, chidai, jinshenjibing, manxingjibing, diedao, zoushi, yeshi, zisha, qita) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;//载体
        try {
            //
            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, A.getName());
            preparedStatement.setString(2, A.getSex());
            preparedStatement.setString(3, A.getChusheng());
            preparedStatement.setString(4, A.getIDcard());
            preparedStatement.setString(5, A.getShebao());
            preparedStatement.setString(6, A.getMingzu());
            preparedStatement.setString(7, A.getWenhuachengdu());
            preparedStatement.setString(8, A.getZongjiao());
            preparedStatement.setString(9, A.getHunyan());
            preparedStatement.setString(10, A.getJuzhu());
            preparedStatement.setString(11, A.getZhifufangshi());
            preparedStatement.setString(12, A.getJingjilaiyuan());
            preparedStatement.setString(13, A.getChidai());
            preparedStatement.setString(14, A.getJingshenjibing());
            preparedStatement.setString(15, A.getManxingjibing());
            preparedStatement.setString(16, A.getDiedao());
            preparedStatement.setString(17, A.getZoushi());
            preparedStatement.setString(18, A.getYeshi());
            preparedStatement.setString(19, A.getZisha());
            preparedStatement.setString(20, A.getQita());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }

    public void showpin(ArrayList<bean03> book) throws ClassNotFoundException, SQLException {
        String sql1="select * from pin";
        System.out.println("chen1");
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            bean03 A=new bean03();
            A.setPnum(rs.getString(1));
            A.setPdata(rs.getString(2));
            A.setPyuanyin(rs.getString(3));
            A.setName(rs.getString(4));
            A.setIdcard(rs.getString(5));
            A.setRichang(rs.getString(6));
            A.setJingshen(rs.getString(7));
            A.setGanzhi(rs.getString(8));
            A.setShehui(rs.getString(9));
            book.add(A);
        }
    }

    public void updateinfo0(bean02 a)throws ClassNotFoundException, SQLException {
        Connection connection = Util.util.getConnection();
        String sql = " update pin set  pyuanyin=? where name = ? " ;
        PreparedStatement preparedStatement = null;//载体
        try {

            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"已登记");
            preparedStatement.setString(2,a.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }
}
