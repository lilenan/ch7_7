package com.zj.ch7_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 */
@RestController
@SpringBootApplication
public class Ch77Application {

	/**
	 * 模拟一个查询，即接受前台传入的personName，然后返回Person类
	 */
	@RequestMapping(value="/search",produces={MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person(personName,32,"合肥");
	}
	public static void main(String[] args) {
		SpringApplication.run(Ch77Application.class, args);
	}
}
