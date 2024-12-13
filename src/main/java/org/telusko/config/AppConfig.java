package org.telusko.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.telusko.Alien;
import org.telusko.Computer;
import org.telusko.Desktop;
import org.telusko.Laptop;

@Configuration
public class AppConfig {


    @Bean
    public Alien alien(Computer com){ //@Qualifier("desktop")
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

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }

}
