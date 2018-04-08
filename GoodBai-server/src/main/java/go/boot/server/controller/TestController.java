package go.boot.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mg on 2018/4/8.
 */
@Controller
public class TestController {

    @RequestMapping("/helloTest")
    public String hello() {
        System.out.println("我进入了 hello");
        return "helloTest";
    }

}
