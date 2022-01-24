package javaee.Ch04.ch10;

import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class ResultSetTest1 {
    public static void testBeanHandler() throws SQLException {
        BaseDao basedao = new BaseDao();
        String sql = "select * from user where id=?";
        // 获取查询结果
        Object object = basedao.query(sql, new BeanHandler(User.class), 1);
        // 判断查询结果，如果是User类就进行打印，否则打印查询的结果信息
        if (object!=null && object instanceof User){
            User user= (User) object;
            System.out.print("id为1的User对象的name值为：" + user.getName());
        }else {
            System.out.println("查询结果为空: "+object);
        }
    }
    public static void main(String[] args) throws SQLException {
        testBeanHandler();
    }
}

