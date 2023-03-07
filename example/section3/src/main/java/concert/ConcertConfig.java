package concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
/** 3.加一个注解 （加上一个代理对象）*/
@EnableAspectJAutoProxy //开启AspectJ的自动代理机制
public class ConcertConfig {
    @Bean
    public Performance concert() {
        return new Concert();
    }
    @Bean
    public Performance concert2() {
        return new Concert();
    }

    /** 2.切面实例化 */
   @Bean
    public Audience audience() { //定义Audience的bean
        return new Audience();
    }


    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }
}