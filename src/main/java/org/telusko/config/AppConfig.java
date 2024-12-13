package org.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.telusko.Desktop;

@Configuration
public class AppConfig {


    //@Bean(name = {"com2", "desktop1", "Beast"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

}
