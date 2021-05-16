package io.library.starter.LibraryController;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Autowired
	private LogService logService;
	
	@RequestMapping("/getAllLog")
	public List<LogModel> getAllLog(){
		return logService.getBooks();
	}
	
	@RequestMapping("/getLog?date={date}")
	public LogModel getTopic(@PathVariable String date) {
		return logService.findbydate(date);
	}

	@RequestMapping("/checkIn?name={name}")
	public void addBook(@PathVariable String name) {
		logService.findByCheckIn(name,"IN");
	}

	@RequestMapping("/checkOut?name={name}")
	public void addBook(@PathVariable String name) {
		logService.findByCheckIn(name,"OUT");
	}
}



