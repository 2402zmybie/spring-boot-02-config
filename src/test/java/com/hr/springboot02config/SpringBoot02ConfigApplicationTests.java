package com.hr.springboot02config;

import com.hr.springboot02config.bean.Person;
import com.hr.springboot02config.bean.Person01;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SpringBoot单元测试, 可以很方便的自动注入
 */
@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Person01 person01;

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void test1() {
        System.out.println(person01);
    }

    @Test
    void testHelloService() {
        boolean b = ioc.containsBean("helloService");
        //false 当在主配置类上加上@ImportResource(locations = {"classpath:beans.xml"})之后就是true
        System.out.println(b);
    }

}
