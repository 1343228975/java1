package javaee.Ch04.ch09;
import java.util.Date;

public class JdbcInsertTest{
    public static void main(String[] args) {
        // 向users表插入一个用户信息
        UsersDao ud = new UsersDao();
        User user=new User();
        user.setId(5);
        user.setUsername("hl");
        user.setPassword("123");
        user.setEmail("hl@sina.com");
        user.setBirthday((java.sql.Date) new Date());
        boolean b=ud.insert(user);
        System.out.println(b);
    }
}
