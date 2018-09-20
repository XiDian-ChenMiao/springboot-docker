package com.xidian.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述：项目主入口文件
 * 创建作者：陈苗
 * 创建时间：9/20/18 9:33 PM
 */
@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
    @GetMapping("/index")
    public String index() {
        return "Hello Docker!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }
}
