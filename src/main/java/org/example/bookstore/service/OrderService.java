package org.example.bookstore.service;

import org.example.bookstore.model.Order;
import org.example.bookstore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void saveOrder(Order order) {
        orderRepository.save(order);
    }
}
