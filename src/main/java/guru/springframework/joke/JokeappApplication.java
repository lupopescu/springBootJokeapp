package guru.springframework.joke;


import guru.springframework.joke.controllers.JokeClontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication

@ComponentScan(value={"guru.springframework.joke.app",
        "guru.springframework.joke.controllers",
        "guru.springframework.joke.services","guru.springframework.norris.chuck.ChuckNorrisQuotes"},basePackageClasses=JokeClontroller.class)
public class JokeappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(JokeappApplication.class, args);
		 //for (String name: applicationContext.getBeanDefinitionNames()) {
	     //       System.err.println(name);
	       // }
	}
}
