package project1.spring.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.spring.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
