package com.devmam.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmam.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	/*findAllByOrderByName -> Name é o nome da classe, ordenando por nome 
	  sendo 'Asc' e 'Desc' -> crescente ou decrescente
	*/
	List<Product> findAllByOrderByNameAsc();

}
