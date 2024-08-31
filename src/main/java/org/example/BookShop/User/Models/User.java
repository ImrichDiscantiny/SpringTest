package org.example.BookShop.User.Models;

import jakarta.persistence.*;
import org.example.BookShop.BookShow.Models.BookEntity;

import java.util.Set;

@Entity
@Table(name = "Users")
public class User {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "nickName")
    private String nickName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

//    @ManyToMany
//    private Set<BookEntity> books;

}
