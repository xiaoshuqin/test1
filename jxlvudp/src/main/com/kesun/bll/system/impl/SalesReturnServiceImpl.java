package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DOrders;
import kesun.dao.system.impl.DSalesReturn;
import kesun.entity.system.Orders;
import kesun.entity.system.Organization;
import kesun.entity.system.SalesReturn;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Service("bSalesReturn")
public class SalesReturnServiceImpl extends SuperService implements kesun.bll.system.ISalesReturn {
    @Resource(name="dSalesReturn")
    private DSalesReturn dao;//信息分类数据层对象变量
    public SalesReturnServiceImpl(){
        setModel(new SalesReturn());
    }
    public int updateParent() {
        if (getModel()==null || getModel() instanceof Organization ==false) return 0;
        return dao.updateParent((SalesReturn) getModel());
    }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "退货信息表";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
}
