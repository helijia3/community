package hlj.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author helj
 * @version 1.0
 * @date 2020-07-24 上午 9:18
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    //@ResponseBody
    public String index(){
        return "index";
    }
}
