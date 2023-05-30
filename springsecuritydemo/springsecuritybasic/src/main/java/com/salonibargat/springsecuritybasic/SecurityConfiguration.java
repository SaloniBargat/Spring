package com.salonibargat.springsecuritybasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@EnableWebSecurity //it tells to the spring that this is a web security configuraion
@Configuration
public class SecurityConfiguration{
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {    //Authentication
		        
		        UserDetails admin = User.withDefaultPasswordEncoder()
		                .username("dipika")
		                .password("pass")
		                .authorities("admin")
		                .build();
		        UserDetails user = User.withDefaultPasswordEncoder()
		                .username("manav")
		                .password("password")
		                .authorities("user")
		                .build();
		        
		        return new InMemoryUserDetailsManager(admin, user);
	}
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception   //Authorization
	{
		//http.authorizeHttpRequests().anyRequest().authenticated(); //this will authenticated all request
		http.authorizeHttpRequests()
		.requestMatchers("/admin","/user").authenticated()
		.requestMatchers("/welcome").permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();
	}

}
