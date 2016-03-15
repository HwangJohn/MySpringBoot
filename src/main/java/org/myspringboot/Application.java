package org.myspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *      org.myspringboot
 *        |_ Application.java
 * </pre>
 * <p/>
 * <pre>
 *
 * </pre>
 *
 * @Company :
 * @Author : 황중원
 * @Date : 2016. 3. 9.
 * @Version : 1.0
 */
@Configuration	// 현재의 클래스가 Spring의 설정파일임을 어플리케이션 컨텍스트에게 알려주는 역할
@EnableAutoConfiguration	// Spring Boot가 클래스패스 셋팅, 다른 Bean들, 다양한 설정들에 의해 Bean을 추가함
@ComponentScan	// Spring에게 패키지 안에서 다른 컴포넌트, 설정, 서비스를 찾도록 함
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);	// 어플리케이션을 시작

		logger.info("Spring Boot Started.");

	}
}
