package auromicro.login.registration.loginregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
//@EnableCaching
@SpringBootApplication
public class LoginRegistrationMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginRegistrationMicroservicesApplication.class, args);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().
                apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).
                paths(PathSelectors.any()).build().apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo("AuroMicroService ", "AuroMicroService", "1.0",
                "Terms of service", null, null, null, new ArrayList<>());
    }


}
