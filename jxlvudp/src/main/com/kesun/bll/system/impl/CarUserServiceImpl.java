package kesun.bll.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICarUser;
import kesun.dao.IDoData;
import kesun.dao.system.impl.DCarUser;
import kesun.entity.system.CarUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 肖淑琴 on 2018/5/10.
 */
@Service("bCarUser")
public class CarUserServiceImpl extends SuperService implements ICarUser {
    @Resource(name="dCarUser")
    private DCarUser dao;
    public CarUserServiceImpl() {
        setModel(new CarUser());
    }

    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "汽车用户管理信息";
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
