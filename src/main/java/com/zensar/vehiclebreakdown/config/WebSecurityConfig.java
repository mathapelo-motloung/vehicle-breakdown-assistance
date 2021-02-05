package com.zensar.vehiclebreakdown.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.zensar.vehiclebreakdown.service.UserDetailsServiceImpl;

@ComponentScan
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userDetailsService)
		.passwordEncoder(getPasswordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
		       .antMatchers("/admin/**").authenticated()
		       .antMatchers("/user/**").authenticated()
		       .anyRequest().permitAll()
		       .and()
		       .formLogin().loginPage("/login").permitAll();
	}
	
	private PasswordEncoder getPasswordEncoder() {
     return new PasswordEncoder() {
			
			@Override
			public boolean matches(CharSequence charSequence, String s) {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public String encode(CharSequence charSequence) {
				// TODO Auto-generated method stub
				return charSequence.toString();
			}
		};
	}
}
