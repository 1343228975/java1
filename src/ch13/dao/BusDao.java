package ch13.dao;

import ch13.daomin.Busness;
import ch13.daomin.Notice;
import ch13.daomin.Order;
import ch13.daomin.User;
import ch13.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusDao {
    public void addShop(Busness buss) throws SQLException {
        String sql = "insert into bus(busnessname,telplone,email) values(?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,buss.getName(),buss.getTelphone(),buss.getEmail());
        if (row == 0) {
            throw new RuntimeException();
        }
    }
    public List<Busness> getAllInfo() throws SQLException {
        String sql = "select * from bus ";//order by id asc limit 0,3
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new ResultSetHandler<List<Busness>>() {
            public List<Busness> handle(ResultSet rs) throws SQLException {
                //创建订单集合
                List<Busness> busnesses = new ArrayList<Busness>();
                //循环遍历订单和用户信息
                while (rs.next()) {
                    Busness busness = new Busness();
                    busness.setId(rs.getInt("bus.ID"));
                    busness.setTelphone(rs.getString("bus.telplone"));
                    busness.setName(rs.getString("bus.busnessname"));
                    busness.setEmail(rs.getString("bus.email"));
                    busnesses.add(busness);
                }
                return busnesses;
            }

       });
    }
    public void deleteBus(String id) throws SQLException {
        String sql = "delete from bus where id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql, id);
    }
}
