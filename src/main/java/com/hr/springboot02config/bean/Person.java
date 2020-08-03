package com.hr.springboot02config.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Data是lombok插件, 自动生成get,set方法
 * 1. @ConfigurationProperties: 告诉SpringBoot将本类中所有属性和配置文件中相关的配置进行绑定
 *   prefix = 'person' 配置文件中哪个下面的所有属性进行一一映射
     只有这个组件是容器中额组件,才能容器提供的@ConfigurationProperties功能
   2. 不使用@ConfigurationProperties, 直接使用@Value注解给属性赋值


    如果说，我们只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@Value；
    如果说，我们专门编写了一个javaBean来和配置文件进行映射，我们就直接使用@ConfigurationProperties；
 */
@Data
@Component
//@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * <bean/>
     */

    @Value("${person.last-name}")
    private String lastName;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
