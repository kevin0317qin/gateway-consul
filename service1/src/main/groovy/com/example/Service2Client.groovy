package com.example

import com.example.domain.Book
import io.micronaut.configuration.hystrix.annotation.HystrixCommand
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable
import io.micronaut.retry.annotation.Retryable

@Client(id = "service2")
@Recoverable
interface Service2Client {
    @Get("/books")
    @HystrixCommand Flowable<ArrayList<Book>> findBooks();
}