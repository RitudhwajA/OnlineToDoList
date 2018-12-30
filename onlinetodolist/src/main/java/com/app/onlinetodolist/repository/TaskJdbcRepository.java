/**
 * 
 */
package com.app.onlinetodolist.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.onlinetodolist.mapper.TaskMapper;
import com.app.onlinetodolist.pojo.CustomTask;

/**
 * @author Ritudhwaj
 *
 */
@Repository
public class TaskJdbcRepository {
	@Autowired
	JdbcTemplate template;
	/**
	 * 
	 */
	public TaskJdbcRepository() {
		// TODO Auto-generated constructor stub
	}

	public List<CustomTask> getAllTasks() {
		return template.query("select * from task;", new TaskMapper());
	}
	
	public void deleteTask(int id) {
		template.update("delete from task where id=?", new Object[] { id });
	}

	public void addTask(CustomTask task) {
		template.update("insert into task (title, description,status,lastupdated) " + "values(?, ?,?,?)",
				new Object[] { task.getTitle(), task.getDescription(),task.getCompleted(),new java.util.Date(System.currentTimeMillis()) });
	}
	
	public void updateTask(int id){
		template.update("update task set status=?,lastupdated=? where id=?",true,new java.util.Date(System.currentTimeMillis()),id);
	}
	
	
}
