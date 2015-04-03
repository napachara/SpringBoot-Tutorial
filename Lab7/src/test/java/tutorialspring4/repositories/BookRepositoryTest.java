package tutorialspring4.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import tutorial.spring4.StandAloneApp;
import tutorial.spring4.entities.Book;
import tutorial.spring4.repositories.BookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StandAloneApp.class)
@WebAppConfiguration
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void testUser() {

		Book book = bookRepository.findOne("Naruto");

		assertEquals("Naruto", book.getTitle());
	}
}
