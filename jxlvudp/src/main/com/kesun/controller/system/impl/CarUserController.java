package kesun.controller.system.impl;

import kesun.bll.SuperService;
import kesun.bll.system.ICarUser;
import kesun.bll.system.impl.CarUserServiceImpl;
import kesun.controller.SuperController;
import kesun.util.JSONAndObject;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 肖淑琴 on 2018/5/10.
 */
@Controller
@RequestMapping("carUser")
public class CarUserController extends SuperController implements ICarUser {
    @Resource(name = "bCarUser")
    private CarUserServiceImpl bll;

    public SuperService getService() {
        return bll;
    }
    @RequestMapping("/index")
    public String index(){
        return "system/carUser/carUserManage";
    }


    public Map<String, Object> getConditionParam(JSONObject param) {
        if (param==null) return  null;//判断条件是否为空param是页面传递的值
        Map<String,Object> values=new HashMap<String, Object>();
        if (JSONAndObject.GetJsonStringValue(param,"condition")!=null)
        {
            values.put("id", JSONAndObject.GetJsonStringValue(param,"condition"));
            values.put("name",JSONAndObject.GetJsonStringValue(param,"condition"));
        }
        return values;
    }

    public Map<String, Object> setFindFilter(JSONObject param) {
        return null;
    }
}
