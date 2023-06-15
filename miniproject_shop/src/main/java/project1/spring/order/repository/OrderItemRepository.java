package project1.spring.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.spring.order.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
