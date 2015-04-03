package tutorial.spring4.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutorial.spring4.entities.Book;
import tutorial.spring4.repositories.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

	private final static Logger LOG =LoggerFactory.getLogger(BookController.class);
	
	@Resource(name="bookRepository")
	private BookRepository bookRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Book> getAll(final Model model) {
		
		return bookRepository.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Book getBook(final Model model, @PathVariable String id) {
		
		return bookRepository.findOne(id);
	}
	
	@RequestMapping(value="/publisher/{publisherCode}", method=RequestMethod.GET)
	public List<Book> getBookByPublisherCode(final Model model, @PathVariable String publisherCode) {
		
		return bookRepository.findBypublisher_PublisherCode(publisherCode);
	}
	
	
}
