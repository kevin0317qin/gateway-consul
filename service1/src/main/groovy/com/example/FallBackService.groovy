package com.example

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Flowable;
import io.micronaut.retry.annotation.Recoverable;

@Fallback
//@Recoverable
class FallBackService implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
        Book book1 = new Book(title: "success", author: "QJY", isbn: "001")
        return Flowable.just([book1])
    }
}