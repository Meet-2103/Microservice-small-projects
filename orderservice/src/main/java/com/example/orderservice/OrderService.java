package com.example.orderservice;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OrderService {

    @Autowired
    ProductClient productClient;


    public void getProductDetails(String id){
        productClient.getProductById(id);
        System.out.println("Rate limiter content came");
    }



}
