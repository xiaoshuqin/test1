package kesun.dao.system.impl;


import kesun.dao.DaoSupport;
import kesun.dao.system.ICars;
import kesun.dao.system.ISell;
import kesun.entity.system.Cars;
import kesun.entity.system.Sell;
import org.springframework.stereotype.Repository;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Repository("dSell")
public class DSell extends DaoSupport implements ISell {
    public DSell(){
        setMapperName("mapper.SellMapper");//设置新闻分类数据库操作的配置文件
    }

    public int updateParent(Sell node) {
        if (node==null || node.getParent()==null || getSqlSessionTemplate()==null) return 0;
        return getSqlSessionTemplate().insert(getMapperName()+".updateParent",node);
    }
}
