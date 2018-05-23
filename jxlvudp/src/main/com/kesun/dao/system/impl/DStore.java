package kesun.dao.system.impl;


import kesun.dao.DaoSupport;
import kesun.dao.system.ICars;
import kesun.dao.system.IStore;
import kesun.entity.system.Cars;
import kesun.entity.system.Store;
import org.springframework.stereotype.Repository;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Repository("dStore")
public class DStore extends DaoSupport implements IStore {
    public DStore(){
        setMapperName("mapper.StoreMapper");//设置新闻分类数据库操作的配置文件
    }

    public int updateParent(Store node) {
        if (node==null || node.getParent()==null || getSqlSessionTemplate()==null) return 0;
        return getSqlSessionTemplate().insert(getMapperName()+".updateParent",node);
    }
}
