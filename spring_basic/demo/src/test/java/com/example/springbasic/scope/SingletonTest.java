package com.example.springbasic.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class SingletonTest {

    @Test
    public void singletonBeanFind() {
        // 스프링 컨텍스트 초기화
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class);

        // 빈 조회
        SingletonBean singletonBean1 = ac.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = ac.getBean(SingletonBean.class);

        // 출력
        System.out.println("singletonBean1 = " + singletonBean1);
        System.out.println("singletonBean2 = " + singletonBean2);

        // 검증
        Assertions.assertThat(singletonBean1).isSameAs(singletonBean2);

        // 컨텍스트 종료
        ac.close();
    }

    // Singleton Bean 정의
    @Scope("singleton")
    static class SingletonBean {

        @PostConstruct
        public void init() {
            System.out.println("singleton bean init");
        }
        @PreDestroy
        public void close() {
            System.out.println("singleton bean close");
        }
    }
}
