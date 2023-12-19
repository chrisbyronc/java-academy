package com.pluralsight.config;

import com.pluralsight.dao.CardDAO;
import com.pluralsight.dao.CardDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CardDAO cardDAO() {
        return new CardDAOImpl();
    }
}
