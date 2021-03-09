package com.jiawa.wiki.Controller;

import com.jiawa.wiki.entity.Demo;
import com.jiawa.wiki.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService testService;

    @GetMapping("/list1")
    public List<Demo> list(){
        return testService.list();
    }
}
