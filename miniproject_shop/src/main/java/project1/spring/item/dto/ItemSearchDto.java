package project1.spring.item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import project1.spring.item.constant.ItemSellStatus;

@Getter
@Setter
@ToString
public class ItemSearchDto {

	//검색한 날짜 형태
	private String searchDateType;
	
	//상품 판매 상태
	private ItemSellStatus searchSellStatus;

	//어떤 방법으로 찾을지(구분)
	private String searchBy;

	//검색어
	private String searchQuery = "";
	
}
