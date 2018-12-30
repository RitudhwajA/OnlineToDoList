/**
 * 
 */
package com.app.onlinetodolist.pojo;

import java.util.Date;

/**
 * @author Ritudhwaj
 *
 */

public class CustomTask {

	private int id;
	private String title;
	private String description;
	private boolean completed;
	private String lastupdated;

	/**
	 * 
	 */
	public CustomTask() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param taskId
	 * @param title
	 * @param description
	 * @param lastUpdated
	 */
	public CustomTask(int id, String title, String description, boolean Completed) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.completed = completed;
	}

	/**
	 * @return the taskId
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param taskId
	 *            the taskId to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the Completed
	 */
	public boolean getCompleted() {
		return completed;
	}

	/**
	 * @param Completed
	 *            the isCompleted to set
	 */
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	/**
	 * @return the lastUpdated
	 */
	public String getLastupdated() {
		return lastupdated;
	}

	/**
	 * @param lastUpdated
	 *            the lastUpdated to set
	 */
	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomTask [id=" + id + ", title=" + title + ", description=" + description + ", Completed="
				+ completed + ", lastUpdated=" + lastupdated + "]";
	}

}
