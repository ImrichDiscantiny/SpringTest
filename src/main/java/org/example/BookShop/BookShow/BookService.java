package org.example.BookShop.BookShow;

import org.example.BookShop.BookShow.Models.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class BookService {

    final private BookRepository bookRepository;

    @Autowired
    BookService(BookRepository repository) {
        this.bookRepository = repository;
    }


    public BookEntity loadBooks(){
        try {
            return null;
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to load book: " + e.getMessage());
        }

    }

    public BookEntity findById(Long id){
        try {
            return bookRepository.findById(id).orElse(null);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to load book: " + e.getMessage());
        }

    }
}
