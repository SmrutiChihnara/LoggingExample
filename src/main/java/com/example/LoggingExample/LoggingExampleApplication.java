package com.example.LoggingExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoggingExampleApplication {
	Logger log= LoggerFactory.getLogger (LoggingExampleApplication.class);
@GetMapping("get/{name}")
	public String getLogheck(@PathVariable String name)
	{
		log.debug ("Logger debung",name);
		log.info ("info Test");
		log.error ("error test");
		return "HelloLogger";
	}
@GetMapping("gerData")
	public String getData()
	{
		return "getData";
	}


	public static void main(String[] args) {

		SpringApplication.run(LoggingExampleApplication.class, args);
	}

}
