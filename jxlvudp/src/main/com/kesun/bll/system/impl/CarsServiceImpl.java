package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICars;
import kesun.bll.web.INewsCategory;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DCars;
import kesun.dao.web.impl.DNewsCategory;
import kesun.entity.system.Cars;
import kesun.entity.system.Organization;
import kesun.entity.web.NewsCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Service("bCars")
public class CarsServiceImpl extends SuperService implements ICars {
    @Resource(name="dCars")
    private DCars dao;//信息分类数据层对象变量
    public CarsServiceImpl(){
        setModel(new Cars());
    }
    public int updateParent() {
        if (getModel()==null || getModel() instanceof Organization ==false) return 0;
        return dao.updateParent((Cars) getModel());
    }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "汽车信息表";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
}
