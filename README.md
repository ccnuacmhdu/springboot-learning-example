Spring boot 学习笔记

参考资料<br/>
[1] [GitHub JeffLi1993/springboot-learning-example](https://github.com/JeffLi1993/springboot-learning-example)

## 1. chapter1 （Spring boot 入门）
创建 Spring boot 项目方式列举
- [官网在线创建](https://start.spring.io/)
- IDEA Spring Initializr（社区版没这个，可装插件 Spring Assistant）
- 创建 Maven 项目，在引入 Spring boot 的依赖包


启动 Spring boot 项目方式列举
- 在配置了 @SpringBootApplication 注解的类文件，右键运行
- 在 chapter-1-spring-boot-quickstart 目录下执行命令，<br/>
`mvn clean package` <br/>
`java -jar target/chapter-1-spring-boot-quickstart-1.0.jar`

项目访问路径（注意 application.properties 中配置了端口号为 80）
- http://127.0.0.1/hello
- http://127.0.0.1/book/hello
