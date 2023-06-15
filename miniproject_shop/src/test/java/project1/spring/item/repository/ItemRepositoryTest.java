package project1.spring.item.repository;

import static project1.spring.item.entity.QItem.item;

//import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.thymeleaf.util.StringUtils;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

import project1.spring.item.constant.ItemSellStatus;
import project1.spring.item.entity.Item;
import project1.spring.item.entity.QItem;

@SpringBootTest
class ItemRepositoryTest {

	@Autowired
	ItemRepository itemRepository;
	
//	@PersistenceContext
	@Autowired   		// new로 객체 만들지 않아도 자동으로 객체를 만들어 줌.
	EntityManager em;
	
	@Test
    @DisplayName("상품 저장 테스트")
    public void createItemTest(){
        Item item = new Item();
        item.setItemNm("테스트 상품");
        item.setPrice(10000);
        item.setItemDetail("테스트 상품 상세 설명");
        item.setItemSellStatus(ItemSellStatus.SELL);
        item.setStockNumber(100);
        item.setRegTime(LocalDateTime.now());
        item.setUpdateTime(LocalDateTime.now());
        
        Item savedItem = itemRepository.save(item);
        
        System.out.println(savedItem.toString());
    }
	
	public void createItemList(){
        for(int i=1;i<=10;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100); 
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            
            Item savedItem = itemRepository.save(item);
        }
    }
	
	@Test
    @DisplayName("상품명 조회 테스트")
    public void findByItemNmTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
	
	
	@Test
    @DisplayName("상품명, 상품상세설명 or 테스트")
    public void findByItemNmOrItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemNmOrItemDetail("테스트 상품1", "테스트 상품 상세 설명5");
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }
	
	@Test
	@DisplayName("JPQL 쿼리")
	public void findByItemDetailTest() {
		createItemList();
		
		List<Item> itemList = itemRepository.findByItemDetail("테스트");
		
		for (Item item : itemList) {
			System.out.println(item);
		}
	}
	
	@Test
	@DisplayName("Native 쿼리")
	public void findByItemDetailNativeTest() {
		createItemList();
		
		List<Item> itemList = itemRepository.findByItemDetailNative("테스트");
		
		for (Item item : itemList) {
			System.out.println(item);
		}
	}
	
	@Test
	@DisplayName("querydsl 테스트")
	public void querydslTest() {
		createItemList();
		
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);	//쿼리를 만들어낼 수 있는 팩토리

//아래와 같은 표현		QItem qItem = new QItem("i");	//쿼리를 날릴 대상 도메인
//					QItem qItem = item;
		
		List<Item> list = queryFactory
				.selectFrom(item)		//select(item).from(item)
				.where(item.itemSellStatus.eq(ItemSellStatus.SELL))
				.where(item.itemDetail.like("%" + "1" + "%"))
				.orderBy(item.price.asc())
				.fetch();		   //ctrl + 숫자1 => list를 가져올 수 있다.
		
		for (Item item : list) {
			System.out.println(item);
		}
	}
	
	public void createItemList2(){
        for(int i=1;i<=5;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SELL);
            item.setStockNumber(100);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            itemRepository.save(item);
        }

        for(int i=6;i<=10;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setItemSellStatus(ItemSellStatus.SOLD_OUT);
            item.setStockNumber(0);
            item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            itemRepository.save(item);
        }
    }
	
	
	@Test
	@DisplayName("querydsl 테스트2")
	public void querydslTest2() {
		createItemList2();
		
		String itemDetail = "테스트";
		int price = 10003;
		String itemSellState = "SELL";
		
		QItem item = QItem.item;
		
		BooleanBuilder builder = new BooleanBuilder();
		
		builder.and(item.itemDetail.like("%" + itemDetail + "%"));
		builder.and(item.price.gt(price));
		if(StringUtils.equals(itemSellState, ItemSellStatus.SELL)) {
//			builder.and(item.itemSellStatus.eq(ItemSellStatus.SELL));
		}
		
		Pageable pageable = PageRequest.of(0, 5);
		
		Page<Item> findAll = itemRepository.findAll(builder, pageable);
		
		System.out.println("전체 갯수 : " + findAll.getTotalElements());
		
		List<Item> content = findAll.getContent();
		
		for (Item item2 : content) {
			System.out.println(item2);
		}
	}
	
	
	@Test
	void test() {
		Item item = new Item();
		System.out.println(item);
	}

}
