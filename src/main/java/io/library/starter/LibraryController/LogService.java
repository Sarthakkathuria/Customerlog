package io.library.starter.LibraryController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	
	//for database
	@Autowired
	private LogRepository repo;
	// new Array list because List is immutable 
	
	public List<LogModel> getBooks(){
		return repo.findAll();
	}

	public List<LogModel> findByDate(String date){
		return repo.findbydate(date);
	}
	public List<LogModel> findByCheckIn(String name, String log_type){
		return repo.findByCheckIn(name, log_type);
	}

}
