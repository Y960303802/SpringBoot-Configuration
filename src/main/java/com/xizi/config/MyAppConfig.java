package com.xizi.config;


import com.xizi.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指明当前类是一个配置类，代替之前的Spring配置文件
 *
 * 在配置文件中使用<bean></bean> 标签添加组件
 *
 * */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中
    //组件中默认的id就是方法名
    @Bean
    public HelloService helloService(){
            return  new HelloService();
    }
}
