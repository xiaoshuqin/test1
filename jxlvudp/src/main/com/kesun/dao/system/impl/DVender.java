package kesun.dao.system.impl;

import kesun.dao.DaoSupport;
import kesun.dao.system.IVender;
import kesun.dao.web.INotice;
import org.springframework.stereotype.Repository;

/**
 * Created by heying on 2017/10/29.
 */
@Repository("dVender")
public class DVender extends DaoSupport implements IVender {
    public DVender() {
        setMapperName("mapper.VenderMapper");
    }
    public Boolean objectInUse(String id)
    {
        return false;
    }
}
