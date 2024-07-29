package com.spring.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {MybatisConfig.class} ;  // 외부 설정 내용 등록 (Mybatis)
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringConfig.class}; // 스프링 관련 설정 내용 등록
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};  // URL 패턴 등록
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {new UTF8Filter()};  // UTF-8 인코딩 적용
	}

}
