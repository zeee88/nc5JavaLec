package com.admin_page.admin.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin_page.admin.user.entity.User;


//JpaRepository<Entity 클래스, PK 타입>
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);
	
//	User findByUserName(String userName);
}
