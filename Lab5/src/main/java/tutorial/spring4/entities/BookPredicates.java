package tutorial.spring4.entities;

import com.mysema.query.types.Predicate;

public class BookPredicates {

	public static Predicate overPrice(Double price) {
		QBook book = QBook.book;

		return book.price.gt(price);
	}
	
	public static Predicate lowerPrice(Double price) {
		QBook book = QBook.book;

		return book.price.lt(price);
	}

}
