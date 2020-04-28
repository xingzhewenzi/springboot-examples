package cloud.xingzhe.springbootmybatisplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket creatRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) //用于创建api的基本信息
                .select()   // 创建一个构造器 定义那些控制器生成的文档中包含哪些方法
                .apis(RequestHandlerSelectors.basePackage("cloud.xingzhe.springbootmybatisplus.controller")) // 用于定义包含那些控制器
                .paths(PathSelectors.any()) // 用于url是否可以被映射到控制器中显示文档
                .build();
    }
    private ApiInfo apiInfo(){
        Contact contact=new Contact("行者蚊子", //作者名称
                "https://blog.csdn.net/qq_39290878", //swagger点击Terms of service 的跳转地址
                "email地址");  //email
        return new ApiInfoBuilder()
                .title("SpringBoot整合MybatisPlus")
                .description("简单整合与使用")
                .contact(contact)
                .version("1.0")
                .build();
    }

}
