package hello.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //A사용자 10000원 주문
        int priceA = statefulService1.order("userA", 10000);
        //B사용자 20000원 주문
        int priceB = statefulService1.order("userB", 20000);

        //A사용자 주문 금액 조회

        System.out.println("priceA = " + priceA);
        System.out.println("priceB = " + priceB);

    }
    static class TestConfig{

        @Bean
        public StatefulService statefulService(){
            return new StatefulService();
        }
    }

}