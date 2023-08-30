package Dao;

import Bean.bean01;
import Bean.bean02;
import Bean.bean04;
import Bean.bean05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pdao {

    public void showrichang0(ArrayList<bean04> book) throws ClassNotFoundException, SQLException {
        String sql1="select * from richangshenghuopinggu";
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean04 A=new bean04();
            A.setDate(rs.getString(1));
            A.setName(rs.getString(2));
            A.setIdcard(rs.getString(3));
            A.setJingshi(rs.getString(4));
            A.setXizao(rs.getString(5));
            A.setXiushi(rs.getString(6));
            A.setChuanyi(rs.getString(7));
            A.setDabian(rs.getString(8));
            A.setXiaobian(rs.getString(9));
            A.setRuce(rs.getString(10));
            A.setChuangyizhuanyi(rs.getString(11));
            A.setPingdixingzou(rs.getString(12));
            A.setShangxialouti(rs.getString(13));
            A.setSumrichang(rs.getString(14));
            A.setRichangfenji(rs.getString(15));
            book.add(A);
        }
    }

    public void addrichang0(bean04 a)throws ClassNotFoundException, SQLException{
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        String r = s.format(d);
        System.out.println(r);
        Connection connection = Util.util.getConnection();
        String sql = "INSERT INTO richangshenghuopinggu (name,idcard,jingshi,xizao,xiushi,chuanyi,dabian,xiaobian,ruce,chuangyizhuanyi,pingdixingzou,shangxialouti,sumrichang,richangfenji,date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;//载体
        try {
            //
            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,a.getName() );
            preparedStatement.setString(2, a.getIdcard());
            preparedStatement.setString(3,a.getJingshi());
            preparedStatement.setString(4,a.getXizao());
            preparedStatement.setString(5, a.getXiushi());
            preparedStatement.setString(6, a.getChuanyi());
            preparedStatement.setString(7, a.getDabian());
            preparedStatement.setString(8,a.getXiaobian());
            preparedStatement.setString(9,a.getRuce());
            preparedStatement.setString(10, a.getChuangyizhuanyi());
            preparedStatement.setString(11, a.getPingdixingzou());
            preparedStatement.setString(12, a.getShangxialouti());
            preparedStatement.setString(13,a.getSumrichang());
            preparedStatement.setString(14,a.getRichangfenji());
            preparedStatement.setString(15,r);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }

    public void updaterichang(bean04 a)  throws ClassNotFoundException, SQLException{
        Connection connection = Util.util.getConnection();
        String sql = " update pin set  richang=? where name = ?" ;
        PreparedStatement preparedStatement = null;//载体
        try {

            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,a.getRichangfenji());
            preparedStatement.setString(2,a.getName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }


    public void addjingshen0(bean05 a) throws ClassNotFoundException, SQLException{
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        String r = s.format(d);
        System.out.println(r);
        Connection connection = Util.util.getConnection();
        String sql = "INSERT INTO jinshenpinggu(date, name, idcard, renzhi, gongji, yiyu, jinsheng, jinshenfenji) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;//载体
        try {
            //
            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,r);
            preparedStatement.setString(2, a.getName());
            preparedStatement.setString(3,a.getIdcard());
            preparedStatement.setString(4,a.getRenzhi());
            preparedStatement.setString(5, a.getGongji());
            preparedStatement.setString(6,a.getYiyu());
            preparedStatement.setString(7,a.getJinsheng());
            preparedStatement.setString(8, a.getJinshenfenji());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }
    public void updatejinshen(bean05 a)  throws ClassNotFoundException, SQLException{
        Connection connection = Util.util.getConnection();
        String sql = " update pin set  jingshen=? where name = ? AND idcard = ?" ;
        PreparedStatement preparedStatement = null;//载体
        try {

            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,a.getJinshenfenji());
            preparedStatement.setString(2,a.getName());
            preparedStatement.setString(3,a.getIdcard());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }

    public void showjinshen0(ArrayList<bean05> book) throws ClassNotFoundException, SQLException {
        String sql1="select * from jinshenpinggu";
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            System.out.println(rs.getString(1));
            bean05 A=new bean05();
            A.setDate(rs.getString(1));
            A.setName(rs.getString(2));
            A.setIdcard(rs.getString(3));
            A.setRenzhi(rs.getString(4));
            A.setRenzhi(rs.getString(5));
            A.setGongji(rs.getString(6));
            A.setYiyu(rs.getString(7));
            A.setJinsheng(rs.getString(8));
            A.setJinshenfenji(rs.getString(9));
            book.add(A);
        }
    }
}
