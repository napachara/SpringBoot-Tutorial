package tutorialspring4.controllers;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import tutorial.spring4.controllers.HelloController;
import tutorial.spring4.forms.HelloForm;


public class HelloControllerTest extends ContextControllerTest{

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void getHello() throws Exception {
		HelloForm form = new HelloForm();
		form.setSay("Hi");
		form.setName("Hello");
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())

		.andExpect(jsonPath("$.say", is(form.getSay()))).andExpect(jsonPath("$.name", is(form.getName())));
	}
}
