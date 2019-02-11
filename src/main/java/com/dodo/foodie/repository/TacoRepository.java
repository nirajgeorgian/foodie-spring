package com.dodo.foodie.repository;

import com.dodo.foodie.models.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
