package project1.spring.item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project1.spring.item.entity.ItemImg;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long>{

	//쿼리 메소드
	List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);
}
