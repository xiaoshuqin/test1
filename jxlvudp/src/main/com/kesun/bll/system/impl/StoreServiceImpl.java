package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICars;
import kesun.bll.system.IStore;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DCars;
import kesun.dao.system.impl.DStore;
import kesun.entity.system.Cars;
import kesun.entity.system.Organization;
import kesun.entity.system.Store;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Service("bStore")
public class StoreServiceImpl extends SuperService implements IStore {
    @Resource(name="dStore")
    private DStore dao;//信息分类数据层对象变量
    public StoreServiceImpl(){
        setModel(new Store());
    }
    public int updateParent() {
        if (getModel()==null || getModel() instanceof Organization ==false) return 0;
        return dao.updateParent((Store) getModel());
    }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "库存表";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
}
