package io.library.starter.LibraryController;

import javax.persistence.Entity;
import javax.persistence.Id;


//jpa will create table with 4 columns
@Entity
public class LogModel {
	@Id
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;
	
	
	public LogModel() {
		
	}

	public LogModel(String name, String logType,String date,String time){
		super();
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = time;
		this.id = name+time;
	}

	public LogModel(String name, String logType) {
		super();
		LocalDate rr=LocalDate.now();
		String formattedDate = rr.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		this.name = name;
		this.logType = logType;
		this.date = formattedDate;
		this.time = LocalTime.now().toString();
		this.id = name+time;
	}

	public LogModel(String name, String logType,String date) {
		super();
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = LocalTime.now().toString();
		this.id = name+time;
	}


	// getter and setter is pending Add it from 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
}
