package com.example.INIT.CONFIG;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author zzt
 * @create 2022/10/30
 * @Description <TODO purpose>
 * @Version TODO1.0.x
 * @tittle Knife4jConfiguration
 **/
@Configuration

public class Knife4jConfiguration {

    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
    return   new Docket(DocumentationType.SWAGGER_2)
       .apiInfo(new ApiInfoBuilder()
       .description("#Meanul APIS COllECTIONS")
       .termsOfServiceUrl("https://github.com/AllianceToBeBytedancer")
       .version("TJC V1.0x-Beta")
       .title("TJC KNIFE4J API INFO")
       .build())
       .groupName("TJC OFFICIAL PLATFROM")
       .host("https://hsjc.tcu.edu.cn")
       .select()
       .paths(PathSelectors.any())
       .build();
    }
}
