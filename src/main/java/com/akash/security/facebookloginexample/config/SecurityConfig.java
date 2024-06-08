package com.akash.security.facebookloginexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {


//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**");
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/home.html").authenticated()
//                .and().formLogin().loginPage("/home.html").permitAll()
//                .and().logout().permitAll();
//
//        http.csrf().disable();

//        http.authorizeRequests()
//                .antMatchers("/login_success").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login()
//                .loginPage("/logintest").and().oauth2Login()
//                .defaultSuccessUrl("/login_success")
//                .failureUrl("/logintest");
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/logintest")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2Login()
                .defaultSuccessUrl("/login_success")
                .failureUrl("/logintest");
//                .and()
//                .addFilterBefore("",UsernamePasswordAuthenticationFilter.class);
        return http.build();

    }


//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/", "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().permitAll()
//                .and()
//                .oauth2Login()
//                .loginPage("/login")
//                .userInfoEndpoint()
//                .userService(oauth2UserService)
//                .and()
//                .successHandler(new AuthenticationSuccessHandler() {
//
//                    @Override
//                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                                        Authentication authentication) throws IOException, ServletException {
//
//                        response.sendRedirect("/list");
//                    }
//                });
//    }

//    @Autowired
//    private CustomOAuth2UserService oauth2UserService;

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationMgr) throws Exception {
//        authenticationMgr.inMemoryAuthentication().withUser("admin").password("admin").authorities("ROLE_USER").and()
//                .withUser("javainuse").password("javainuse").authorities("ROLE_USER", "ROLE_ADMIN");
//    }

}