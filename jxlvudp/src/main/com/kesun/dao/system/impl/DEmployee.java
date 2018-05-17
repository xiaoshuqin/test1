package kesun.dao.system.impl;

import kesun.controller.system.ICarUser;
import kesun.controller.system.IEmployee;
import kesun.dao.DaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by 肖淑琴 on 2018/5/10.
 */
@Repository("dEmployee")
public class DEmployee extends DaoSupport implements IEmployee{
    public DEmployee() {
        setMapperName("mapper.EmployeeMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
