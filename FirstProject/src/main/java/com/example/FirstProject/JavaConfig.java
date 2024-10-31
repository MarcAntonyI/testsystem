package com.example.FirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.FirstProject")
@PropertySource("classpath:value.properties")
public class JavaConfig {
    @Bean
    public TEN ten(){
        return new TEN();
    }
    @Bean
    public USD usd(){
        return new USD();
    }
    @Bean EUR eur(){
        return new EUR();
    }
    @Bean ShowCurrency showCurrency(){
        return new ShowCurrency(eur(), usd(), ten());
    }
}
