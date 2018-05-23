package kesun.dao.system.impl;


import kesun.dao.DaoSupport;
import kesun.dao.system.ICars;
import kesun.dao.system.IOrders;
import kesun.entity.system.Cars;
import kesun.entity.system.Orders;
import org.springframework.stereotype.Repository;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Repository("dOrders")
public class DOrders extends DaoSupport implements IOrders {
    public DOrders(){
        setMapperName("mapper.OrdersMapper");//设置新闻分类数据库操作的配置文件
    }

    public int updateParent(Orders orders) {
        if (orders==null || orders.getParent()==null || getSqlSessionTemplate()==null) return 0;
        return getSqlSessionTemplate().insert(getMapperName()+".updateParent",orders);
    }
}
