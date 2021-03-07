package com.jiawa.wiki.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController 返回字符串或者JSON   @Controller //返回页面
@RestController

public class TestController {
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
        return "hello love";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello love ? Post="+name;
    }
}
