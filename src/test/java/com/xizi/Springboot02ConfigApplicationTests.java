package com.xizi;

import com.xizi.pojo.Dog;
import com.xizi.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SpringBoot单元测试
 * 可以在测试期间方便进行自动注入等容器
 *
 */

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void testPerson() {
        System.out.println(person);
    }

    @Test
    void testDog(){
        System.out.println(dog);
    }

    @Test
    public void testHelloService(){
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

}
