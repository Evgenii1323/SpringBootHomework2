package com.example.springboothomework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public AuthorizationService service(UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}