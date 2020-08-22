package demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 该注解用来标注启动类，被标注的类为一个配置类，并会触发自动配置和 Starter 组件扫描。
 * 根据源码可得，该注解配置了 @SpringBootConfiguration、 @EnableAutoConfiguration 和 @ComponentScan
 * 三个注解， @SpringBootConfiguration 注解又配置了 @Configuration。
 * 所以该注解的职责相当于结合了 @Configuration、@EnableAutoConfiguration 和 @ComponentScan 三个注解的功能。
 *
 * @SpringBootApplication 注解的职责如下。
 *
 * 1. @Configuration 等同于 Spring 的 XML 配置文件
 * 2. @EnableAutoConfiguration 自动配置
 * 3. @ComponentScan 组件扫描，把标识了 @Controller，@Service，@Repository，@Component 注解的类装配到 Spring 容器中
 */
@SpringBootApplication
public class QuickStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class, args);
    }
}
