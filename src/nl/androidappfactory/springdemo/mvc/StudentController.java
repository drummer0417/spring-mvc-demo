package nl.androidappfactory.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;

	@Value("#{languages}")
	private Map<String, String> languages;

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// create student
		Student student = new Student();

		// add student to model
		model.addAttribute("student", student);

		// add the countryOptions to the model
		model.addAttribute("theCountries", countryOptions);

		// add the languages to the model
		model.addAttribute("languages", languages);

		return "student-form";
	}

	@RequestMapping("/regConfirmation")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-reg-confirmation";
	}
}
