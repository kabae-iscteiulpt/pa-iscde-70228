package pt.iscte.pidesco.task;

import java.util.Date;

import pt.iscte.pidesco.tasklist.Priority;

public class Task {

	private String check;
	private String description;
	private String resource;
	private String path;
	private String location;
	private Priority priority;
	private Date initialDate;
	private Date finalDate;

	/**
	 * @param check
	 * @param description
	 * @param resource
	 * @param path
	 * @param location
	 * @param priority
	 * @param initialDate
	 * @param finalDate
	 */
	public Task(String check, String description, String resource, String path, String location, Priority priority,
			Date initialDate, Date finalDate) {
		this.setCheck(check);
		this.setDescription(description);
		this.setResource(resource);
		this.setPath(path);
		this.setLocation(location);
		this.setPriority(priority);
		this.setInitialDate(initialDate);
		this.setFinalDate(finalDate);
	}
	
	public Task(String description) {
		
	}

	/**
	 * @return check
	 */
	public String getCheck() {
		return check;
	}

	/**
	 * @param check
	 */
	public void setCheck(String check) {
		this.check = check;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return resource
	 */
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	/**
	 * @return finalDate
	 */
	public Date getFinalDate() {
		return finalDate;
	}

	/**
	 * @param finalDate
	 */
	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}

}
