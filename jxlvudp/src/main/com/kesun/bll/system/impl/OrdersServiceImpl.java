package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICars;
import kesun.dao.IDoData;
import kesun.dao.system.IOrders;
import kesun.dao.system.impl.DCars;
import kesun.dao.system.impl.DOrders;
import kesun.entity.system.Cars;
import kesun.entity.system.Orders;
import kesun.entity.system.Organization;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Service("bOrders")
public class OrdersServiceImpl extends SuperService implements kesun.bll.system.IOrders {
    @Resource(name="dOrders")
    private DOrders dao;//信息分类数据层对象变量
    public OrdersServiceImpl(){
        setModel(new Orders());
    }
    public int updateParent() {
        if (getModel()==null || getModel() instanceof Organization ==false) return 0;
        return dao.updateParent((Orders) getModel());
    }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "订单信息表";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
}
