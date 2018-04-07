package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeClontroller {
	public JokeService jokeService;

	@Autowired
	public JokeClontroller(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/c", "" })
	public String showJoke(Model model) {
		System.err.println("!!!!!!!!!!!!!!  @RequestMapping books");
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";

	}

}
