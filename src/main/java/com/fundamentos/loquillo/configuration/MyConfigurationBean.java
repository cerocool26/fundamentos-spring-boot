package com.fundamentos.loquillo.configuration;

import com.fundamentos.loquillo.bean.MyBeanImplement;
import com.fundamentos.loquillo.bean.Mybean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public Mybean beanOperation(){

        return new MyBeanImplement();
    }
}
