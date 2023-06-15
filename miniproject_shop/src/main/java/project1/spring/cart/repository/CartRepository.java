package project1.spring.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.spring.cart.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
	

}
