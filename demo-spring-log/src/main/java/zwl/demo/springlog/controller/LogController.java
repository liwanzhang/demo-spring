package zwl.demo.springlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangwanli
 * @description
 * @date 2018-12-11 下午3:13
 */
@Controller
@RequestMapping("/logs")
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/hello")
    @ResponseBody
    public String test() {
        LOGGER.info("hello, world! This com from spring!");
        return "hello, world! This com from spring!";
    }
}
