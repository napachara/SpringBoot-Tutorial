package tutorialspring4.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import tutorial.spring4.StandAloneApp;
import tutorial.spring4.controllers.ThymeleafController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StandAloneApp.class)
@WebAppConfiguration
public class ThymeleafControllerTest {

	private MockMvc mvc;


	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup() {

		// Process mock annotations
		MockitoAnnotations.initMocks(this);

		// Setup Spring test in webapp-mode (same config as spring-boot)
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testThymeleafView() throws Exception {
		mvc.perform(get("/thymeleaf")).andExpect(status().isOk())
				.andExpect(view().name("thymeleaf"));
	}

}
