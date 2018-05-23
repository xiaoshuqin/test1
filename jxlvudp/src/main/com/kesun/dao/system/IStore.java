package kesun.dao.system;

import kesun.entity.system.Cars;
import kesun.entity.system.Store;

/**
 * Created by wph-pc on 2017/5/30.
 */
public interface IStore
{
    /*更新当前数据词典的父级节点*/
    int updateParent(Store node);
}
