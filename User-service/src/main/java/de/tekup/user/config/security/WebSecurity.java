package de.tekup.user.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurity extends WebSecurityConfigurerAdapter{@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		// accept all requests
		http.authorizeRequests().antMatchers("/api/users").permitAll();
	}

}
