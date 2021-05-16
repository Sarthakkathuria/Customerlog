package io.library.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//this is starting point of spring application
@SpringBootApplication
public class LibraryAppApi {

	public static void main(String[] args) {
		SpringApplication.run(LibraryAppApi.class,args);

	}

	@Bean
	public CommandLineRunner loadData(LogModelRepository repo)
	{
		return(args)->{
				repo.save(new LogModel("kyo","OUT","2021/04/15"));
				repo.save(new LogModel("kyo","IN","2021/04/15","11:13:04.176095200"));
				repo.save(new LogModel("Sarthak","IN","2021/05/15","11:13:04.176095200"));
				repo.save(new LogModel("Sarthak","OUT"));
		};
	}


}
