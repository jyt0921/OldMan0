package Dao;

import Bean.bean01;
import Bean.bean03;
import Bean.bean04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class dao {
    public void showall(ArrayList<bean01> book) throws ClassNotFoundException, SQLException {
        String sql1="select * from tigong";
        System.out.println("222222");
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ResultSet rs =  ps.executeQuery();//获取结果集
        System.out.println(rs);
        while(rs.next()) {
            bean01 A=new bean01();
            A.setTigongname(rs.getString(1));
            A.setGuanxi(rs.getString(2));
            A.setName(rs.getString(3));
            A.setPhone(rs.getString(4));
            A.setIDcard(rs.getString(5));
//            System.out.println(rs.getString(5));
            book.add(A);
        }
    }

    public void adddengji0(bean01 A )throws ClassNotFoundException, SQLException{
        Connection connection = Util.util.getConnection();
        String sql = "INSERT INTO tigong (tigongname,guanxi,name,phone,IDcard) values(?,?,?,?,?)";
        PreparedStatement preparedStatement = null;//载体
        try {
            //
            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, A.getTigongname());
            preparedStatement.setString(2, A.getGuanxi());
            preparedStatement.setString(3, A.getName());
            preparedStatement.setString(4, A.getPhone());
            preparedStatement.setString(5, A.getIDcard());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }

    public void adddengji1(bean01 A ) throws ClassNotFoundException, SQLException, ParseException {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        String r = s.format(d);
        System.out.println(r);
        Connection connection = Util.util.getConnection();
        String sql = "INSERT INTO pin (pnum,pdata,pyuanyin,name,idcard,richang,jingshen,ganzhi,shehui) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = null;//载体
        try {
            //
            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"1007");
            preparedStatement.setString(2, r);
            preparedStatement.setString(3, "尚未登记");
            preparedStatement.setString(4, A.getName());
            preparedStatement.setString(5, A.getIDcard());
            preparedStatement.setString(6,"尚未评估");
            preparedStatement.setString(7,"尚未评估");
            preparedStatement.setString(8,"尚未评估");
            preparedStatement.setString(9,"尚未评估");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }
    //按提供者姓名查看提供者信息
    public void selectTName(ArrayList<bean01> book, String name) throws ClassNotFoundException, SQLException{
        String sql1="select * from tigong where tigongname = ?";
        System.out.println(name);
        System.out.println("11111111");
        PreparedStatement pre=null;
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,name);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            bean01 A = new bean01();
            A.setTigongname(rs.getString(1));
            A.setGuanxi(rs.getString(2));
            A.setName(rs.getString(3));
            A.setPhone(rs.getString(4));
            A.setIDcard(rs.getString(5));
            book.add(A);
        }
    }
    //按提供者电话查看提供者信息
    public void selectTPhone(ArrayList<bean01> book, String Phone) throws ClassNotFoundException, SQLException{
        String sql1="select * from tigong where phone = ?";
        PreparedStatement pre=null;
        System.out.println("11111111");
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,Phone);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            bean01 A = new bean01();
            A.setTigongname(rs.getString(1));
            A.setGuanxi(rs.getString(2));
            A.setName(rs.getString(3));
            A.setPhone(rs.getString(4));
            A.setIDcard(rs.getString(5));
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            book.add(A);
        }
    }


    public void deleteT(String iDcard) throws ClassNotFoundException, SQLException{
        Connection connection = Util.util.getConnection();
        System.out.println(iDcard);
        String sql = "delete from tigong where IDcard = ?";
        PreparedStatement preparedStatement = null;
        preparedStatement = connection.prepareStatement(sql);
        // preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, iDcard);//获取编号
        preparedStatement.executeUpdate();
    }

    public void updateT(bean01 a) throws ClassNotFoundException, SQLException{
        Connection connection = Util.util.getConnection();
        String sql = " update tigong set guanxi = ?,name = ?,phone=? where tigongname = ? AND IDcard = ?" ;
        PreparedStatement preparedStatement = null;//载体
        try {

            preparedStatement = connection.prepareStatement(sql);
            // preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,a.getGuanxi());
            preparedStatement.setString(2,a.getName());
            preparedStatement.setString(3,a.getPhone());
            preparedStatement.setString(4,a.getTigongname());
            preparedStatement.setString(5,a.getIDcard());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
    }

    public void selectZid(ArrayList<bean04> book, String name11) throws ClassNotFoundException, SQLException{
        String sql1="select * from richangshenghuopinggu where idcard = ?";
        PreparedStatement pre=null;
        System.out.println("11111111");
        Connection con=Util.util.getConnection();
        PreparedStatement ps=con.prepareStatement(sql1);
        ps.setString(1,name11);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            bean04 A = new bean04();
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

    public void selectdata1(ArrayList<bean04> book,String id) throws ClassNotFoundException, SQLException {
        Connection connection= Util.util.getConnection();
        String sql1="SELECT date,sumrichang FROM richangshenghuopinggu where idcard = ? order by date asc ";
//        String sql1="SELECT * FROM text3_1 ORDER BY RAND() LIMIT 100";
        PreparedStatement pre=null;
        PreparedStatement ps=connection.prepareStatement(sql1);
        ps.setString(1,id);
        ResultSet rs =  ps.executeQuery();//获取结果集
        while(rs.next()) {
            bean04 A=new bean04();
            A.setDate(rs.getString(1));
            A.setSumrichang(rs.getString(2));
//            A.setRound(rs.getString(4));
            book.add(A);
        }
    }

    public void sel9(ArrayList<bean03> book) throws ClassNotFoundException, SQLException {
        Connection connection= Util.util.getConnection();
        String sql1="SELECT pnum, pdata, pyuanyin, name, idcard, richang, jingshen, ganzhi, shehui FROM pin ";
//        String sql1="SELECT * FROM text3_1 ORDER BY RAND() LIMIT 100";
        PreparedStatement pre=null;
        PreparedStatement ps=connection.prepareStatement(sql1);
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
//            A.setRound(rs.getString(4));
            book.add(A);
        }
    }

    public void sel99(ArrayList<bean03> book,String name) throws ClassNotFoundException, SQLException {
        Connection connection= Util.util.getConnection();
        String sql1="SELECT pnum, pdata, pyuanyin, name, idcard, richang, jingshen, ganzhi, shehui FROM pin where name=? ";
//        String sql1="SELECT * FROM text3_1 ORDER BY RAND() LIMIT 100";
        PreparedStatement pre=null;
        PreparedStatement ps=connection.prepareStatement(sql1);
        ps.setString(1,name);
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
//            A.setRound(rs.getString(4));
            book.add(A);
        }
    }
}
