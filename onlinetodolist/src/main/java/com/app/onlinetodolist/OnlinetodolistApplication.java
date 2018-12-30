package com.app.onlinetodolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.onlinetodolist.pojo.CustomTask;
import com.app.onlinetodolist.repository.TaskJdbcRepository;

@SpringBootApplication
public class OnlinetodolistApplication {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	TaskJdbcRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OnlinetodolistApplication.class, args);
	}

}
