package tutorial.spring4.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tutorial.spring4.forms.HelloForm;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafController {

	private final static Logger LOG = LoggerFactory.getLogger(ThymeleafController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public String getPage(final Model model) {
		LOG.debug("getPage(final Model model)");
		
		HelloForm form = new HelloForm();
		form.setSay("Hi");
		form.setName("Thymeleaf");
		
		model.addAttribute("thymeleaf", form);
		return "thymeleaf";
	}
}
