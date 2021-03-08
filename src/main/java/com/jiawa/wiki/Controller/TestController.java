package com.jiawa.wiki.Controller;

import com.jiawa.wiki.entity.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//RestController 返回字符串或者JSON   @Controller //返回页面
@RestController

public class TestController {
    //读取自定义配置项 :TSET 默认值
    @Value("${test.hello:TEST}")
    private String hello;

    @Autowired
    private TestService testService;

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

    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }
}
