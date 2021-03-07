package com.jiawa.wiki.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
