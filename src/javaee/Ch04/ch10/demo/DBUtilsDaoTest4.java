package javaee.Ch04.ch10.demo;

import javaee.Ch04.ch10.User;

import java.sql.SQLException;

public class DBUtilsDaoTest4 {
    private static DBUtilsDao dao = new DBUtilsDao();
    public static void testfind() throws SQLException {
        User user = dao.find(2);
        System.out.println(user.getId() + "," + user.getName() + ","
                + user.getPassword());
    }
    public static void main(String[] args) throws SQLException {
        testfind();
    }
}