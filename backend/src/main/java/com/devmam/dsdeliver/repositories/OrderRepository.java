package com.devmam.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devmam.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	//escrevendo a consulta de busca no repository
	//linguagem jpql
	//(Order) é o nome da classe e (obj) é apelido para busca
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();
	

}
