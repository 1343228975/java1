package javaee.Ch04.ch09;

import java.sql.*;

public class example01 {
    public static void main(String[] args) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/zl?&useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "123456";
            conn = DriverManager.getConnection (url, username,
                    password);

            stmt = conn.createStatement();

            String sql = "select * from users";
            rs = stmt.executeQuery(sql);




            System.out.println("id | name   | password | email  | brithday");
            while (rs.next()) {
                int id = rs.getInt("id"); // 通过列名获取指定字段的值
                String name = rs.getString("name");
                String psw = rs.getString("password");
                String email = rs.getString("email");
                Date birthday = rs.getDate("brithday");
                System.out.println(id + " | " + name + " | " + psw + " | " + email
                        + " | " + birthday);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally{

            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                rs = null;
            }
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}
