package project1.spring.item.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import project1.spring.item.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>, 
			QuerydslPredicateExecutor<Item>{

	List<Item> findByItemNm(String ItemNm);
	
	List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
	
	//위의 코드와 동일
	@Query("select i from Item i where i.itemDetail like %:itemDetail% "
			+ "order by i.price desc")  //i는 클래스 Item의 별칭
	List<Item> findByItemDetail(@Param("itemDetail")String itemDetail);
	
	//native쿼리
	@Query(value = "select * from item i where i.item_Detail like %:itemDetail% "
			+ "order by i.price desc",nativeQuery = true)  //i는 클래스 Item의 별칭
	List<Item> findByItemDetailNative(@Param("itemDetail")String itemDetail);
}
