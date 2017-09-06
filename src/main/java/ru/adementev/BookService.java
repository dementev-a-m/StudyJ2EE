package ru.adementev;

import ru.adementev.entity.Book;
import ru.adementev.logger.Loggable;
import ru.adementev.numberGenerator.NumberGenerator;
import ru.adementev.numberGenerator.ThirteenDigits;

import javax.inject.Inject;

/**
 * Created by Антон Дементьев on 06.09.2017.
 */
public class BookService {
    @Inject@ThirteenDigits
    private NumberGenerator generator;
    @Loggable
    public Book createdBook(String title, double price, String description){
        Book book = new Book(title,price,description);
        book.setNumber(generator.generateNumber());
        return book;
    }
}
