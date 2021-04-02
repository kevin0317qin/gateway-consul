package com.example

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;
import io.micronaut.retry.annotation.Recoverable;

@Fallback
@Recoverable
class FallBackService implements Service2Client {
    @Override
    Flowable<ArrayList<Book>> findBooks() {
//        return Flowable.just(new ArrayList<Book>())
//        return Flowable.just([new Book(title: "success", author: "QJY", isbn: "001")])
        Book book1 = new Book(title: "success", author: "QJY", isbn: "001")
        print("get in?")
        return Flowable.just([book1])
    }
}