package com.jiawa.wiki.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController 返回字符串或者JSON   @Controller //返回页面
@RestController

public class TestController {
    //读取自定义配置项
    @Value("${test:hello}")
    private String hello;

    /*
    * GET POST PUT DELETE
    *@PostMapping
    * @PutMapping
    * @DeleteMapping
    * @return
    * @RequestMapping(value = '/user',method = RequestMethod.GET)
    * */

    @GetMapping("/hello")
    public String hello(){
        return "hello love"+hello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello love ? Post="+name;
    }
}
