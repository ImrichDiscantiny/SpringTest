package org.example.BookShop.BookShow;


import org.example.BookShop.BookShow.Models.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService service;

    @Autowired
    BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<?> loadBooks(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getBook(@PathVariable("id") Long id){

        BookEntity var = service.findById(id);

        var httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(new MediaType("text", "plain", StandardCharsets.UTF_8));

        return new ResponseEntity<>("Text Message here" + var, httpHeaders, HttpStatus.OK);
    }

    @PostMapping("/manage")
    public ResponseEntity<?> addBook(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/manage")
    public ResponseEntity<?> putBook(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/manage")
    public ResponseEntity<?> deleteBook(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
