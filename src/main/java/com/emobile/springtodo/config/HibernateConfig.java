package com.emobile.springtodo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hibernate")
public class HibernateConfig {
    // пусто — убрали SessionFactory- бин, чтобы не было циклов
}
