package nl.androidappfactory.springdemo.mvc.customer;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer")
@Controller
public class CustomerController {

	// Trim all leading and trailing blanks from all Strings on the form
	// If it contains whitespace only it will be trimmed to null
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		System.out.println("stringtrimmer: " + dataBinder.getObjectName());
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);

	}

	@RequestMapping("/showForm")
	public String processCustomer(Model model) {

		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute Customer customer, BindingResult result) {
		System.out.println("costomer: " + customer);
		System.out.println("bindingResult: " + result);

		if (result.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
