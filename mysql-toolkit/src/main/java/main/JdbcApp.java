package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
        //1注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2建立连接
        String url = "jdbc:mysql://localhost:3306/goozoo";
        String usernName = "root"; //登录数据库的账号
        String password = "root"; //登录数据库的密码
        Connection conn = DriverManager.getConnection(url, usernName, password);
        conn.setAutoCommit(false);

        //3获取执行sQL语句的对象
        Statement statement = conn.createStatement();
        //4获取数据库返回的结果
        //String sql = "delete from emp where empno = " +"7499";
        //String sqlUpdate = "update emp set sal = "+10000+" where empno = " +"7369";

        //String sqlInsert = "INSERT INTO emp VALUES(2018,\"boss\",\"king\",NULL,\"2018-8-
        //8\",15000,10000,10);";
        String sql = "delete  from t_a ";
        String sql2 = "delete  from goozoo2.t_aa2 ";
        //5处理数据集
        int i = statement.executeUpdate(sql);
        //int s = statement.executeUpdate(sqlUpdate);
        //int ins = statement.executeUpdate(sqlInsert);
        System.out.println("goozoo " + i + " 行受到影响----删除");
        int j = statement.executeUpdate(sql2);
        System.out.println("goozoo2 " + j + " 行受到影响----删除");
        //System.out.println(s + "行受到影响----更新");
        //System.out.println(ins + "行受到影响----插入");
        //6关闭连接
        conn.rollback();
        statement.close();
        conn.close();


    }
}
