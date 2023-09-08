package com.codingdojo.daikichipath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	String welcome() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{destination}")
	String travel(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination + "!";
	}
	@RequestMapping("/lotto/{lottoNumber}")
	String lotto(@PathVariable("lottoNumber") int lottoNumber) {
		return (lottoNumber % 2 == 0 ? "You will take a grand journey in the near future, but beware of tempting offers." : "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.");
	}
}