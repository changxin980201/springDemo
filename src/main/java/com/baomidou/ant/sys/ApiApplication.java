package com.baomidou.ant.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

//@ComponentScan(basePackages = {"com.baomidou.*"})
@Configuration
@MapperScan("com.baomidou.ant.sys.dao")
@SpringBootApplication
@Controller
//(exclude= DataSourceAutoConfiguration.class)
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
