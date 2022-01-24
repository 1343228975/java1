package javaee.Ch04.ch10.demo;

import javaee.Ch04.ch10.User;
import javaee.Ch04.ch10.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class DBUtilsDao {

    public List findAll() throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());

        String sql = "select * from user";

        List list = (List) runner.query(sql,
                new BeanListHandler(User.class));
        return list;
    }

    public User find(int id) throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());

        String sql = "select * from user where id=?";

        User user = (User) runner.query(sql,
                new BeanHandler(User.class), new Object[] { id });
        return user;
    }

    public Boolean insert(User user) throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());

        String sql = "insert into user (name,password) values (?,?)";

        int num = runner.update(sql,
                new Object[] { user.getName(), user.getPassword() });
        if (num > 0)
            return true;
        return false;
    }

    public Boolean update(User user) throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());

        String sql = "update  user set name=?,password=? where id=?";

        int num = runner.update(sql, new Object[] { user.getName(),
                user.getPassword(),user.getId() });
        if (num > 0)
            return true;
        return false;
    }

    public Boolean delete(int id) throws SQLException {

        QueryRunner runner = new QueryRunner(C3p0Utils.getDataSource());

        String sql = "delete from user where id=?";

        int num = runner.update(sql, id);
        if (num > 0)
            return true;
        return false;
    }
}