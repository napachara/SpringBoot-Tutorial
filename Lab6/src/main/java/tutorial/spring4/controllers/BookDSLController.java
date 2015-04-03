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

import com.google.common.collect.Lists;

import tutorial.spring4.entities.Book;
import tutorial.spring4.entities.BookPredicates;
import tutorial.spring4.repositories.BookRepository;

@RestController
@RequestMapping("/bookdsl")
public class BookDSLController {

	private final static Logger LOG = LoggerFactory.getLogger(BookDSLController.class);
	
	@Resource(name="bookRepository")
	private BookRepository bookRepository;
	
	@RequestMapping(value="/over/{price}", method=RequestMethod.GET)
	public List<Book> getPriceOver(final Model model, @PathVariable Double price) {
		LOG.debug("getPriceOver(final Model model, @PathVariable Double price<{}>)", price);
		
		return Lists.newArrayList(bookRepository.findAll(BookPredicates.overPrice(price)));
	}
	
	@RequestMapping(value="/lower/{price}", method=RequestMethod.GET)
	public List<Book> getPriceLower(final Model model, @PathVariable Double price) {
		LOG.debug("getPriceLower(final Model model, @PathVariable Double price<{}>)", price);
		
		return Lists.newArrayList(bookRepository.findAll(BookPredicates.lowerPrice(price)));
	}
}
