package nl.androidappfactory.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerr {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
