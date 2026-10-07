package com.example.coffeeshoporderingsystem.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration //이 클래스는 스프링의 설정 클래스이다
@EnableJpaAuditing
public class AuditingConfig {
}
