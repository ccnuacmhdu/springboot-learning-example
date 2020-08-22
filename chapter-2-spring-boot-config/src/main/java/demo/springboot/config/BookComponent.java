package demo.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 书属性
 *
 * @ConfigurationProperties 注解方式支持验证功能，即当属性类被 @Validated 注解标注时，Spring Boot 初始化时会验证类的字段。
 */
@Component
@ConfigurationProperties(prefix = "demo.book")
@Validated
public class BookComponent {

    /**
     * 书名
     */
    @NotEmpty
    private String name;

    /**
     * 作者
     */
    @NotNull
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
