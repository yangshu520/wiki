package com.jiawa.wiki.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.jiawa","com.test"}) 支持多个扫描
@ComponentScan("com.jiawa")
@SpringBootApplication
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
    }

//打印信息
//    private  static  final Logger LOG=Logger.getLogger(WikiApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication app=new SpringApplication(WikiApplication.class);
//    }
//
//    Environment env=app.run(args).getEnvironment();
//    LOG.info("启动成功！！！");
//    LOG.info("地址是：\thttp://127.0.0.1:{}",env.getProperty("server.port"))
}
