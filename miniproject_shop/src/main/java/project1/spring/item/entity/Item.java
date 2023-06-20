package project1.spring.item.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import project1.spring.item.constant.ItemSellStatus;
import project1.spring.item.dto.ItemFormDto;
import project1.spring.item.repository.ItemRepository;
import project1.spring.utils.entity.BaseEntity;

@Entity
@Table(name = "item")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Item extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private Long id;			//상품 코드
	
	@Column(nullable = false, length = 50)
	private String itemNm;		//상품 이름
	
	@Column(nullable = false)
	private int price;			//상품 가격
	
	@Column(nullable = false, name ="number")
	private int stockNumber;	//재고 수량
	
	@Lob
	@Column(nullable = false)
	private String itemDetail;	//상품 상세 설명
	
	//enum 이름 자체를 DB에 저장(constant-ItemSellStatus에 있음)
	//열거형은 기본적으로 숫자를 다루는 것이 원칙.
	//ORDINAL: 숫자로 다룬다.  STRING: 문자로 다룬다.
	@Enumerated(EnumType.STRING)				
	private ItemSellStatus itemSellStatus; //상품 판매 상태
	
	//상품 정보 수정
	public void updateItem(ItemFormDto itemFormDto) {
		//웹에서 작성된 정보 itemFormDto에 저장됨. 저장된 것 getItemNm으로 꺼내서 this.itemNm에 넣기
		this.itemNm = itemFormDto.getItemNm();
		this.price = itemFormDto.getPrice();
		this.stockNumber = itemFormDto.getStockNumber();
		this.itemDetail = itemFormDto.getItemDetail();
		this.itemSellStatus = itemFormDto.getItemSellStatus();
		
	}
	
	
	
}
