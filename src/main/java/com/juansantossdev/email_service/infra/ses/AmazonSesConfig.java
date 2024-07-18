package com.juansantossdev.email_service.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonSesConfig{

    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService(){
        return AmazonSimpleEmailServiceClientBuilder.standard().build();
    }
}
