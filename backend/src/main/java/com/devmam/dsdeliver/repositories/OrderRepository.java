package com.devmam.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmam.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
