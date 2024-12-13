package org.telusko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.telusko.Alien;
import org.telusko.Computer;
import org.telusko.Desktop;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(@Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);

        return obj;
    }


    //@Bean(name = {"com2", "desktop1", "Beast"})
    @Bean
    //@Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

}
