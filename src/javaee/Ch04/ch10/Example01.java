package javaee.Ch04.ch10;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Example01 {
    public static DataSource ds = null;
    static {

        BasicDataSource bds = new BasicDataSource();

        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost:3306/zl?&useSSL=false&serverTimezone=UTC");
        bds.setUsername("root");
        bds.setPassword("123456");
        bds.setInitialSize(5);


        ds = bds;
    }
    public static void main(String[] args) throws SQLException {

        Connection conn = ds.getConnection();

        DatabaseMetaData metaData = conn.getMetaData();



        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }
}
