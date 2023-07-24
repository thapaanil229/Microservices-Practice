package com.anil.orderservice.Controller;

import com.anil.orderservice.DTO.OrderRequest;
import com.anil.orderservice.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createOrder(@RequestBody OrderRequest orderRequest){
       orderService.placeOrder(orderRequest);
        return "order placed successfully";
    }
}
