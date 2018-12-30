/**
 * 
 */
package com.app.onlinetodolist.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.onlinetodolist.pojo.CustomTask;

/**
 * @author Ritudhwaj
 *
 */
public final class TaskMapper implements RowMapper<CustomTask> {

	/**
	 * 
	 */
	public TaskMapper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public CustomTask mapRow(ResultSet rs, int row) throws SQLException {
		CustomTask task=new CustomTask();
		task.setId(rs.getInt("id"));
		task.setTitle(rs.getString("title"));
		task.setDescription(rs.getString("description"));
		task.setCompleted(rs.getBoolean("status"));
		task.setLastupdated(rs.getDate("lastUpdated").toString());
		
		return task;
	}

}
