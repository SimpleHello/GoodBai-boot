package go.boot.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mg on 2018/4/8.
 * RestController 用这个标签 直接返回Json
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("/helloTest")
    public Map<String,Object> hello() {
        Map<String,Object> map = new HashMap<>();
        map.put("result","11");
        map.put("message","helloTest");
        log.info("我进入了 ---- info -----");
        log.debug("我进入了---- debug -----");
        log.error("我进入了---- error -----");
        return map;
    }

}
