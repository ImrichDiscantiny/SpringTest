package org.example.BookShop.Review;


import jakarta.persistence.*;
import org.example.BookShop.BookShow.Models.BookEntity;
import org.example.BookShop.User.Models.User;
@Entity
@Table(name = "Ratings")
public class Rating {

    @Id
    private Long id;

    @Column(name = "Rating")
    private Integer rating;

    @Column(name = "Comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id" )
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_isbn", referencedColumnName = "isbn"  )
    private BookEntity book;
}
