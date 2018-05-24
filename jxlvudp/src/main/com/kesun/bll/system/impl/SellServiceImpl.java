package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICars;
import kesun.bll.system.ISell;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DCars;
import kesun.dao.system.impl.DSell;
import kesun.entity.system.Cars;
import kesun.entity.system.Organization;
import kesun.entity.system.Sell;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Service("bSell")
public class SellServiceImpl extends SuperService implements ISell {
    @Resource(name="dSell")
    private DSell dao;//信息分类数据层对象变量
    public SellServiceImpl(){
        setModel(new Sell());
    }
    public int updateParent() {
        if (getModel()==null || getModel() instanceof Organization ==false) return 0;
        return dao.updateParent((Sell) getModel());
    }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "销售信息表";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
}
