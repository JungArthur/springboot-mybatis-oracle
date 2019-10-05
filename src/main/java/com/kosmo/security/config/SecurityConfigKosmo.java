package com.kosmo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfigKosmo extends WebSecurityConfigurerAdapter {

    //BCryptPasswordEncoder를 사용하는 설정
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    //new BCryptPasswordEncoder();  // UserPasswordEncode()

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 세션 옵션 설정
        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // csrf 옵션 설정
        http
                .csrf().disable();
        // 모든 url 감시 안함
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll();
    }
}