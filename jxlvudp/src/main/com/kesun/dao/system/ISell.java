package kesun.dao.system;

import kesun.entity.system.Sell;

/**
 * Created by wph-pc on 2017/5/30.
 */
public interface ISell
{
    /*更新当前数据词典的父级节点*/
    int updateParent(Sell node);
}
