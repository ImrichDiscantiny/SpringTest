package org.example.BookShop.BookShow.Models;


import jakarta.persistence.*;
import org.example.BookShop.Publisher.Models.Publisher;

import java.util.Date;

@Entity
@Table(name = "Books")
public class BookEntity {

    @Id
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "imagePath")
    private String imagePath;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "summary")
    private String summary;

    @Column(name = "reviews_avg")
    private Float reviews;

    @Column(name = "popularity")
    private Integer popularity;

    @Column(name = "isPublished")
    private Boolean isPublished;

    @Column(name = "datePublished")
    private Date datePublished;

    @OneToOne
    @JoinColumn(name = "publisher_id", referencedColumnName = "id" )
    private Publisher publisher;

    @OneToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id"  )
    private Author author;

  
}
