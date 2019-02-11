package com.dodo.foodie.repository;

import com.dodo.foodie.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
