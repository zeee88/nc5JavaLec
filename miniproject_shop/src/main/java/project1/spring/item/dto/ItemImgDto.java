package project1.spring.item.dto;

import org.modelmapper.ModelMapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import project1.spring.item.entity.ItemImg;

@Getter
@Setter
@ToString
public class ItemImgDto {

	private Long id;
	
	private String imgName;
	
	private String oriImgName;
	
	private String imgUrl;
	
	private String repImgYn;	
	
	//modelmapper: dto객체와 entity객체의 변환을 도움.
	//서로 다른 클래스의 값을 필드의 이름과 자료형이 같으면 getter, setter를 통해 값을 복사해서 객체를 반환.
	private static ModelMapper modelMapper = new ModelMapper();
	
	//entity 받으면 dto로 변환
	public static ItemImgDto of(ItemImg itemImg) {
		return modelMapper.map(itemImg, ItemImgDto.class);
	}
}
