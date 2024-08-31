package org.example.BookShop.BookShow;


import org.example.BookShop.BookShow.Models.BookEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Component
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {


    Optional<BookEntity> findById(Long id);
//    List<Book> getMany();



}
