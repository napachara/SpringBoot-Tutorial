package tutorial.spring4.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutorial.spring4.forms.HelloForm;

@RestController
@RequestMapping(value="/hello")
public class HelloController {

	private final static Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public HelloForm sayHi(final Model model) {
		LOG.debug("sayHi(final Model model)");
		
		HelloForm form = new HelloForm();
		form.setSay("Hi");
		form.setName("Hello");
		
		return form;
	}
}
