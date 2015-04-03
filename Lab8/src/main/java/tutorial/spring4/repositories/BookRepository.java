package tutorial.spring4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import tutorial.spring4.entities.Book;

public interface BookRepository extends JpaRepository<Book, String>, QueryDslPredicateExecutor<Book> {

	public List<Book> findBypublisher_PublisherCode(String publisherCode);
}
