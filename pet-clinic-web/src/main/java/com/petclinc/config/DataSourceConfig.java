package com.petclinc.config;

import com.petclinc.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:database.properties")
@Configuration
public class DataSourceConfig {

    @Bean
    FakeDataSource fakeDataSource(
            @Value("${com.username}") String username,
            @Value("${com.password}") String password,
            @Value("${com.url}") String url){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
}
