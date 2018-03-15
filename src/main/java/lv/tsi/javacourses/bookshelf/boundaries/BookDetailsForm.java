package lv.tsi.javacourses.bookshelf.boundaries;

import lv.tsi.javacourses.bookshelf.entities.Book;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RequestScoped
@Named
public class BookDetailsForm {
    @PersistenceContext
    private EntityManager em;

    private Long bookId;



    private Book book;

    public void findBook() {
        book = em.find(Book.class, bookId);
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}