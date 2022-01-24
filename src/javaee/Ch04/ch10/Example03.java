package javaee.Ch04.ch10;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Example03 {
    public static DataSource ds = null;
    // 初始化C3P0数据源
    static {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        // 设置连接数据库需要的配置信息
        try {
            cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/zl?&useSSL=false&serverTimezone=UTC");
            cpds.setUser("root");
            cpds.setPassword("123456");
            // 设置连接池的参数
            cpds.setInitialPoolSize(5);
            cpds.setMaxPoolSize(15);
            ds = cpds;
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        // 获取数据库连接对象
        System.out.println(ds.getConnection());
    }
}
