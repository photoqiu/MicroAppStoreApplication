package com.photoqiu.microAppStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MicroAppStoreApplication {

	public static void main(String[] args) {
		log.info("LoggingApplication start...");
		ConfigurableApplicationContext context = SpringApplication.run(MicroAppStoreApplication.class, args);
		int length = context.getBeanDefinitionNames().length;
		log.trace("Spring boot启动初始化了 {} 个 Bean", length);
		log.debug("Spring boot启动初始化了 {} 个 Bean", length);
		log.info("Spring boot启动初始化了 {} 个 Bean", length);
		log.warn("Spring boot启动初始化了 {} 个 Bean", length);
		log.error("Spring boot启动初始化了 {} 个 Bean", length);
		try {
			int i = 1;
			int j = 1 / i;
			log.info("【SpringBootDemoLogbackApplication】启动：", j);
		} catch (Exception e) {
			log.error("【SpringBootDemoLogbackApplication】启动异常：", e);
		}
	}

}
