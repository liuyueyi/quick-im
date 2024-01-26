package com.github.liuyueyi.im.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YiHui
 * @date 2023/12/7
 */
@Controller
public class TestController {

    @ResponseBody
    @GetMapping(path = "hello")
    public Object sayHello() {
        RestTemplate restTemplate = new RestTemplate();
        Map map = restTemplate.getForObject("https://story.hhui.top/zd/square/joke/query?id=1&traditional=false", HashMap.class);
        return map;
    }

    @GetMapping(path = {"/", "/index", ""})
    public String index() {
        return "index";
    }
}
