package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.IVender;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DVender;
import kesun.entity.system.Vender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heying on 2017/10/29.
 */
@Service("bVender")
public class VenderServiceImpl extends SuperService implements IVender {
    @Resource(name = "dVender")
    private DVender dao;

    public VenderServiceImpl() {
        setModel(new Vender());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "商家信息";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }

    @Override
    public Boolean isInUse() {
        return false;
    }
}
