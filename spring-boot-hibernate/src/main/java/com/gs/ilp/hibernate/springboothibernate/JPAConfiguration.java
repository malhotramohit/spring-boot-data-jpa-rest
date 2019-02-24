package com.gs.ilp.hibernate.springboothibernate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class JPAConfiguration {

	@Bean
	public AuditorAware<String> auditAware(){
		return new AuditAwareImpl();
	}
	
}
