package kesun.dao.system.impl;


import kesun.dao.DaoSupport;
import kesun.dao.system.IOrders;
import kesun.dao.system.ISalesReturn;
import kesun.entity.system.Orders;
import kesun.entity.system.SalesReturn;
import org.springframework.stereotype.Repository;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Repository("dSalesReturn")
public class DSalesReturn extends DaoSupport implements ISalesReturn {
    public DSalesReturn(){
        setMapperName("mapper.SalesReturnMapper");//设置新闻分类数据库操作的配置文件
    }

    public int updateParent(SalesReturn salesReturn) {
        if (salesReturn==null || salesReturn.getParent()==null || getSqlSessionTemplate()==null) return 0;
        return getSqlSessionTemplate().insert(getMapperName()+".updateParent",salesReturn);
    }
}
