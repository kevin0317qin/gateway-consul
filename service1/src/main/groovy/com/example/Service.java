package com.example;

import com.example.domain.Book;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

import java.util.ArrayList;

public interface Service {
    @Get("/books")
    Flowable<ArrayList<Book>> findBooks();
}
