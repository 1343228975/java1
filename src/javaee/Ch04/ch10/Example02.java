package javaee.Ch04.ch10;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class Example02 {
    public static DataSource ds = null;
    static {

        Properties prop = new Properties();
        try {

            InputStream in = new Example02().getClass().getClassLoader()
                    .getResourceAsStream("dhcpconfig.properties");

            prop.load(in);

            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    public static void main(String[] args) throws SQLException {

        Connection conn = ds.getConnection();

        DatabaseMetaData metaData = conn.getMetaData();




        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }
}
