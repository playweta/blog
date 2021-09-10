/**
 * Author: 路笛
 * Date:  2021/7/2 16:02
 */
package com.code.controller.front;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontAboutController {
    //关于我页面
    @RequestMapping("/front/about")
    public String about(){
        return "front/about";
    }
}