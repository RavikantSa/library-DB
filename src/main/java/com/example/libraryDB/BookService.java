package com.example.libraryDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void createBook(Book book) throws Exception {
//         bookRepository.createbook(book);

//        if(bookRepository.findById(book.getId()).get() != null){
//            throw new Exception("Book is already present");
//        }
        bookRepository.save(book);
    }

    public Book getBookById(Integer id) {
//        try{
//            Book book1  = bookRepository.findById(id).get();
//            return  book1;
//        }catch (Exception e){
//            throw  new RuntimeException(e);
//        }
        Book book1  = bookRepository.findById(id).get();
        System.out.println(book1.getName());
        return  book1;
    }

}
