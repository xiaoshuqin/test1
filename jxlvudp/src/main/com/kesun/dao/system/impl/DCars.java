package kesun.dao.system.impl;


import kesun.dao.DaoSupport;
import kesun.dao.system.ICars;
import kesun.dao.web.INewsCategory;
import kesun.entity.system.Cars;
import kesun.entity.web.NewsCategory;
import org.springframework.stereotype.Repository;

/**
 * Created by wph-pc on 2017/10/16.
 */
@Repository("dCars")
public class DCars extends DaoSupport implements ICars {
    public DCars(){
        setMapperName("mapper.CarsMapper");//设置新闻分类数据库操作的配置文件
    }

    public int updateParent(Cars node) {
        if (node==null || node.getParent()==null || getSqlSessionTemplate()==null) return 0;
        return getSqlSessionTemplate().insert(getMapperName()+".updateParent",node);
    }
}
