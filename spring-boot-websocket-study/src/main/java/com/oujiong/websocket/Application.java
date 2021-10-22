package com.oujiong.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description: 启动类。更多内容请参考：https://www.cnblogs.com/qdhxhz/category/1166311.html
 *
 * @author xub
 * @date 2019/11/11 下午3:39
 */
@EnableScheduling
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
