Spring boot 学习笔记（入门级）

参考资料<br/>
[1] [GitHub JeffLi1993/springboot-learning-example](https://github.com/JeffLi1993/springboot-learning-example)

# 1. chapter-1 入门
### 创建 Spring boot 项目方式列举
- [官网在线创建](https://start.spring.io/)
- IDEA Spring Initializr（社区版没这个，可装插件 Spring Assistant）
- 创建 Maven 项目，在引入 Spring boot 的依赖包


### 启动 Spring boot 项目方式列举
- 在配置了 @SpringBootApplication 注解的类文件，右键运行
- 在 chapter-1-spring-boot-quickstart 目录下执行命令，<br/>
`mvn clean package` <br/>
`java -jar target/chapter-1-spring-boot-quickstart-1.0.jar`

项目访问路径（注意 application.properties 中配置了端口号为 80）
- http://127.0.0.1/hello
- http://127.0.0.1/book/hello

# 2. chapter-2 配置
## 2.1 配置快速入门
application.properties + BookProperties + HelloBookController

访问地址：http://127.0.0.1:8080/book/hello
## 2.2 配置属性的获取方式
配置属性的常用获取方式有基于 @Value 和 @ConfigurationProperties 注解两种方式。@Value 注解对 Bean 的变量
或者方法参数进行标注，为其设置默认属性值。通常格式是注解 + SpEL 表达式，如 @Value("SpEL 表达式")，这种方式适用
于小而不复杂的属性结构。属性结构复杂，字段很多的情况下，应该考虑使用 @ConfigurationProperties 注解。

Spring Boot 推荐使用 @ConfigurationProperties 注解方式获取属性。该方式演示可以运行测试用例 testBookComponent

application.properties + BookComponent + HelloBookController

## 2.3 Swagger2 配置
SwaggerConfig 类（自动展现好看的接口文档）
### 注意事项
编码问题<br/>
Java .properties 文件默认编码方式是 iso-8859 ，Spring Boot 应用以 UTF-8 的编码方式读取，就导致出现乱码问题。
官方 Issue 中的解决方法是，将 .properties 文件中配置的中文值转义成 Unicode 编码形式。
中文转 Unicode：[https://javawind.net/tools/native2ascii.jsp]()

配置文件<br/>
可通过在 application.properties 中指定 spring.profiles.active=prod 确定对应生产环境配置文件<br/>
若 .properties 和 .yml 同时存在，默认优先使用 .properties

# 3. chapter-3 JPA
# 4. chapter-4 分页
# 5. chapter-5 Restful
# 6. chapter-6 统一异常处理
# 7. chapter-7 Mybatis
需要在本地安装 MySQL
# 8. chapter-8 Mybatis+Druid 实现多数据源
热点数据放在主库，访问频次低的数据放在从库
# 9. chapter-9 Redis