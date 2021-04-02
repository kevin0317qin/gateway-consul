package com.example.controller

//import com.example.Service2Client
import com.example.ServiceClient
import com.example.domain.Book
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.retry.annotation.Recoverable
import io.reactivex.Flowable

@Controller("/api/billing")
@Recoverable
class BillingController {
    ServiceClient client

    BillingController(ServiceClient client){
        this.client = client
    }

    @Get
    Flowable<ArrayList<Book>> findBooks(){
        client.findBooks()
    }
}
