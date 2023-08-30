package Util;


import java.sql.*;


/**
 * JDBC��������
 */
public class util {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {//创建了一个方法后面会调用

        Connection connection = null;//创建连接对象
        PreparedStatement ps = null;////创建载体
        ResultSet rs = null;//创建结果集对象
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oldman","root","jiang123456");//数据库的名称和自己的账号密码记得改！！！
        return connection;
    }

    public static void close(Connection connection ) {
        try {
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void close(PreparedStatement preparedStatement ) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void close(ResultSet resultSet ) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
