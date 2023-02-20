package com.berkaygursu.springboot.config;

import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { // in controller, preauthorize should be used to determine authority
//		http.csrf().disable()
//			.authorizeHttpRequests( (authorize) -> authorize.anyRequest().authenticated())
//			.httpBasic(Customizer.withDefaults());
//		
//		return http.build();
//	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.cors().and()
			.authorizeHttpRequests() // according to endpoint, authority is determined
			.requestMatchers("/captain/**").hasRole("CAPTAIN") // permitAll(), hasAnyRole() can also be used
			.requestMatchers("/crew/**").hasRole("CREW")
			.anyRequest().authenticated().and()
			.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() { // user information are entered here
		UserDetails berkay = User.builder()
				.username("berkay")
				.password(passwordEncoder().encode("berkay"))
				.roles("USER")
				.build();
		
		UserDetails admin = User.builder()
				.username("admin")
				.password(passwordEncoder().encode("admin"))
				.roles("ADMIN")
				.build();
		
		UserDetails captain = User.builder()
				.username("captain") // captain can also access crew's info
				.password(passwordEncoder().encode("jack"))
				.roles("CAPTAIN", "CREW")
				.build();
		
		UserDetails crew = User.builder()
				.username("crew")
				.password(passwordEncoder().encode("rose"))
				.roles("CREW")
				.build();

		return new InMemoryUserDetailsManager(berkay, admin, captain, crew);
	}

}
