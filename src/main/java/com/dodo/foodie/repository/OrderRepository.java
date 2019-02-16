package com.dodo.foodie.repository;

import com.dodo.foodie.models.Order;
import com.dodo.foodie.models.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    Order findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
