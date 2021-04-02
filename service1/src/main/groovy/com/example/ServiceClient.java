package com.example;

import com.example.domain.Book;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Recoverable;
import io.micronaut.retry.annotation.Retryable;
import io.reactivex.Flowable;

import java.util.ArrayList;
@Client("service2")
@Retryable(attempts = "5", delay = "100ms")
@Recoverable(api=Service.class)
public interface ServiceClient extends Service {

}
