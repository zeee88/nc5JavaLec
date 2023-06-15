package project1.spring.item.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.modelmapper.ModelMapper;

import lombok.Getter;
import lombok.Setter;
import project1.spring.item.constant.ItemSellStatus;
import project1.spring.item.entity.Item;

@Getter
@Setter
public class ItemFormDto {

	private Long id; // 상품 코드

	@NotBlank(message = "상품명은 필수 항목입니다.")
	private String itemNm; // 상품 이름

	@NotNull(message = "가격은 필수 항목입니다.")
	private int price; // 상품 가격

	@NotNull(message = "재고는 필수 항목입니다.")
	private int stockNumber; // 재고 수량

	private ItemSellStatus itemSellStatus; // 상품 판매 상태

	@NotBlank(message = "상품 설명은 필수 항목입니다.")
	private String itemDetail; // 상품 상세 설명

	private LocalDateTime regtime;
	
	private List<ItemImgDto> itemImgDtoList = new ArrayList<>();
	
	//아이디 정보를 받아오려고 함
	private List<Long> itemImgIds = new ArrayList<>();
	
	//modelmapper: dto객체와 entity객체의 변환을 도움.
	//서로 다른 클래스의 값을 필드의 이름과 자료형이 같으면 getter, setter를 통해 값을 복사해서 객체를 반환.
	private static ModelMapper modelMapper = new ModelMapper();
	
	//Item 타입으로 리턴(dto에서 entity로 변환)
	public Item createItem() {
		return modelMapper.map(this, Item.class);
	}
	
	//entity 받으면 dto로 변환
	public static ItemFormDto of(Item item) {
		return modelMapper.map(item, ItemFormDto.class);
	}
	
}
