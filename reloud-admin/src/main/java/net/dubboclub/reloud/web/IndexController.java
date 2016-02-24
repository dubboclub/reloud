package net.dubboclub.reloud.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bieber on 2016/2/24.
 */
@Controller
public class IndexController {

    @RequestMapping("/index.htm")
    public String index(){
        return "index";
    }

}
