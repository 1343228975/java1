package javaee.Ch04.ch10.demo;

import javaee.Ch04.ch10.User;

import java.sql.SQLException;

public class DBUtilsDaoTest1 {
    private static DBUtilsDao dao = new DBUtilsDao();
    public static void testInsert() throws SQLException {
        User user = new User();
        user.setName("赵伦");
        user.setPassword("666666");
        boolean b = dao.insert(user);
        System.out.println(b);
    }
    public static void main(String[] args) throws SQLException {
        testInsert();
    }
}
