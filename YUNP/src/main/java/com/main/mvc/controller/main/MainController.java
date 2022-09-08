package com.main.mvc.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "/mainView.yun")
    public String mainView(){
        System.out.println("요청 !!");
        return "/main/main";
    }


}
