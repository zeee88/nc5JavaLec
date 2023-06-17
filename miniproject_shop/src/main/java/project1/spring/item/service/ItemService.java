package project1.spring.item.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import project1.spring.item.dto.ItemFormDto;
import project1.spring.item.dto.ItemImgDto;
import project1.spring.item.dto.ItemSearchDto;
import project1.spring.item.entity.Item;
import project1.spring.item.entity.ItemImg;
import project1.spring.item.repository.ItemImgRepository;
import project1.spring.item.repository.ItemRepository;

@Service
@RequiredArgsConstructor
@Transactional		//중간에 문제가 생겼을 때 전부 취소하거나 전부 진행
public class ItemService {

	private final ItemRepository itemRepository;
	private final ItemImgRepository itemImgRepository;
	private final ItemImgService itemImgService;
	
	//itemFormDto 값을 넘겨받고, multipart 형식으로 되어 있는 리스트를 받아온다.
	public Long saveItem(ItemFormDto itemFormDto, List<MultipartFile> itemImgFileList) throws IOException {
		
		Item item = itemFormDto.createItem();		//dto를 entity로 변환. create에서 mapper로 바꿨으니까
		itemRepository.save(item);
		
		//그림 저장하기
		for (int i = 0; i < itemImgFileList.size(); i++) {
			ItemImg itemImg = new ItemImg();
			itemImg.setItem(item);		//등록하는 이미지와 아이템 순서에 맞게 연결
			if(i == 0) {
				itemImg.setRepImgYn("Y");		//대표 이미지
			} else {
				itemImg.setRepImgYn("N");		//대표 이미지가 아닌 나머지 이미지
			}
			itemImgService.saveItemImg(itemImg, itemImgFileList.get(i));
			}
		return item.getId();
	}
	
	
	//상품 상세정보 조회(상품 등록 폼에서)
	public ItemFormDto getItemDetail(Long itemId) {
		
		//itemImg DB에서 List 형태로 데이터 가져오기
		List<ItemImg> itemImgList = itemImgRepository.findByItemIdOrderByIdAsc(itemId);
		//entity를 dto로 넘겨주기 위한 List 만들기
		List<ItemImgDto> itemImgDtoList = new ArrayList<>();
		
		//itemImgList들을 가져와서 ItemImg 형태로 만들것이다.
		for (ItemImg itemImg : itemImgList) {
			//entity 받아서 dto로 변환
			ItemImgDto itemImgDto = ItemImgDto.of(itemImg);
			itemImgDtoList.add(itemImgDto);
		}
		
		//리턴 타입이 Optional<Item>이다. Optional로 받거나 EntityNotFoundException로 예외처리해줘야 함.(엔티티가 없을 수 있기 때문)
		Item item = itemRepository.findById(itemId).orElseThrow(EntityNotFoundException::new);
		
		//itemFormDto에 item 정보와 itemImgDtoList(itemImg)정보가 모두 넣어준다.
		ItemFormDto itemFormDto = ItemFormDto.of(item);
		itemFormDto.setItemImgDtoList(itemImgDtoList);
		
		return itemFormDto;
	}
	
	//상품 업데이트(수정)
	public Long updateItem(ItemFormDto itemFormDto, List<MultipartFile> itemImgFileList) throws IOException {
		Item item = itemRepository.findById(itemFormDto.getId()).orElseThrow(EntityNotFoundException::new);
				
		item.updateItem(itemFormDto);
		
		List<Long> itemImgIds = itemFormDto.getItemImgIds();
		
		//업데이트를 위해서는 itemImgIds와 itemImgFileList의 인덱스를 알아야 함.
		for (int i = 0; i < itemImgFileList.size(); i++) {
			itemImgService.updateItemImg(itemImgIds.get(i), itemImgFileList.get(i));
		}
		//수정한 정보(상품)가 무엇인지 알려줌.
		return item.getId();
	}
	
	//ItemRepositoryCustom, ItemRepositoryCustomImpl에서 작성한 쿼리문 출력하기
	public Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable){
		return itemRepository.getAdminItemPage(itemSearchDto, pageable);
	}
	
}

