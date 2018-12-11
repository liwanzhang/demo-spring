package zwl.demo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangwanli
 * @description
 * @date 2018-12-10 下午6:36
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        return "hello, world! This com from spring!";
    }
}
