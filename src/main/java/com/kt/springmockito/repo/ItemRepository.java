package com.kt.springmockito.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.kt.springmockito.entity.Item;
@Component
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
