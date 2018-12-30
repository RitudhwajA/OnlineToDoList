package com.app.onlinetodolist;

import java.util.Random;

import javax.xml.ws.Response;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.onlinetodolist.pojo.CustomTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnlinetodolistApplicationTests {
	
	private static final String url="http://localhost:8080";
	
	private CustomTask createTask(){
		CustomTask task=new CustomTask();
		task.setId(new Random().nextInt());
		task.setTitle("ABC");
		task.setDescription("ABC desc");
		return task;
	}

	@Test
	public void testGetAllTasks(){
	}
	@Test
	public void contextLoads() {
	}

}
