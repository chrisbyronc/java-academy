package com.pluralsight.config;

import com.pluralsight.dao.CardDAO;
import com.pluralsight.dao.CardDAOImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${datasource.username}")
    private String username;

    @Bean
    public CardDAO cardDAO() {
        return new CardDAOImpl(username);
    }
}
