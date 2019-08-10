package com.asia.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangBaoQiang
 * @ClassName: TestController
 * @description: TODO
 * @date 2019/6/1019:49
 * @Version 1.0
 */
@RequestMapping("/test")
@RestController
public class TestController {
    /*@Autowired
    ParamDefineDao paramDefineDao;
    @RequestMapping(path = {"/switchid/{id}"},method = RequestMethod.POST)
    public String getParamSwitch(@PathVariable(name = "id") String id) {
        String paramName = paramDefineDao.getParamName(id);
        return  JSON.toJSONString(paramName, SerializerFeature.WriteMapNullValue);
    }*/
}
