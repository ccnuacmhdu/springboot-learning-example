package demo.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 书属性
 *
 * @Value 注解，对 Bean 的字段或者方法参数进行标注，设置默认属性值。通常格式是注解 + SpEL 表达式，如 @Value("SpEL 表达式")。
 * 使用 @Value 注解来引用属性值时，确保所引用的属性值在 application.properties 文件存在并且相对应匹配，否则会造成 Bean 的
 * 创建错误，引发 java.lang.IllegalArgumentException 非法参数异常。
 */
@Component
public class BookProperties {

    /**
     * 书名
     */
    @Value("${demo.book.name}")
    private String name;

    /**
     * 作者
     */
    @Value("${demo.book.writer}")
    private String writer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
