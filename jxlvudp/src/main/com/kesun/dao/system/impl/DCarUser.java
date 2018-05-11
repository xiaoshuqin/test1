package kesun.dao.system.impl;

import kesun.controller.system.ICarUser;
import kesun.dao.DaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by 肖淑琴 on 2018/5/10.
 */
@Repository("dCarUser")
public class DCarUser extends DaoSupport implements ICarUser {
    public DCarUser() {
        setMapperName("mapper.CarUserMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
