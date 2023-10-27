package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // Configuration이 붙은 클래스를 의존관계에서 빼주는 것
        basePackages = "hello.core", // hello.core 부터 지정할 bean을 탐색 //package 위치를 지정하지 않고 프로젝트 최상단에 위치하는게 좋음
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
