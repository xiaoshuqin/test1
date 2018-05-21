package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICarUser;
import kesun.bll.system.IEmployee;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DEmployee;
import kesun.entity.system.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 肖淑琴 on 2018/5/10.
 */
@Service("bEmployee")
public class EmployeeServiceImpl extends SuperService implements IEmployee {
    @Resource(name="dEmployee")
    private DEmployee dao;
    public EmployeeServiceImpl() { setModel(new Employee());}

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "员工管理信息";
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
