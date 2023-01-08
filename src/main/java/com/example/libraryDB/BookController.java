package com.example.libraryDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add_book")
    public void addBook(@RequestBody() Book book) throws Exception {


       bookService.createBook(book);
//        try {
//            bookService.createBook(book);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }

    @GetMapping("/get_book")
    public  Book getBook(@RequestParam("id") Integer id){
       return bookService.getBookById(id);
//        try{
//          Book book =   bookService.getBookById(id);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }

    }
}
