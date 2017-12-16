package com.jfeesoft.bplatform.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class Oauth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requestMatchers().antMatchers("/permission/*").and().authorizeRequests().anyRequest().authenticated();
		http.anonymous().and().authorizeRequests()
				.antMatchers("/", "/lib/*", "/images/*", "/css/*", "/swagger-ui.js", "/swagger-ui.min.js", "/api-docs",
						"/fonts/*", "/api-docs/*", "/api-docs/default/*", "/o2c.html", "index.html", "/webjars/**",
						"/hystrix/**")
				.permitAll().antMatchers(HttpMethod.GET, "/my").access("#oauth2.hasScope('my-resource.read')")
				.anyRequest().authenticated();

	}

}