package project1.spring.item.service;

import java.io.IOException;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import lombok.RequiredArgsConstructor;
import project1.spring.item.entity.ItemImg;
import project1.spring.item.repository.ItemImgRepository;

@Service
@RequiredArgsConstructor
@Transactional		//중간에 문제가 생겼을 때 전부 취소하거나 전부 진행
public class ItemImgService {

	//application properties에 설정한 이미지 경로
	@Value(value = "${itemImgLocation}")
	private String itemImgLocation;
	
	private final ItemImgRepository itemImgRepository;
	
	private final FileService fileService;
	
	public void saveItemImg(ItemImg itemImg, MultipartFile itemImgFile) throws IOException {
		String oriImgName = itemImgFile.getOriginalFilename();
		String imgName = "";
		String imgUrl = "";
		
		//원래 경로가 값이 비어있는지 타임리프 유틸을 이용해서 확인.
		if(!StringUtils.isEmpty(oriImgName)) {
			imgName = fileService.uploadFile(itemImgLocation, oriImgName, itemImgFile.getBytes());
			imgUrl = "/images/item/" + imgName;
		}
		//아이템 이미지 저장
		itemImg.updateItemImg(oriImgName, imgName, imgUrl);
		itemImgRepository.save(itemImg);
	}
	
	//이미지 업데이트(수정)
	public void updateItemImg(Long ItemImgId, MultipartFile itemImgFile) throws IOException {
		if(!itemImgFile.isEmpty()) {
			ItemImg itemImg = itemImgRepository.findById(ItemImgId).orElseThrow(EntityNotFoundException::new);
			
			if(!StringUtils.isEmpty(itemImg.getImgName())) {
				//itemImgLocation은 application properties 에서 설정한 경로. 
				//경로폴더에 있는 itemImg를 삭제
				fileService.deleteFile(itemImgLocation + "/" + itemImg.getImgName());
			}
			//새로 수정 등록하기
			String oriName = itemImgFile.getOriginalFilename();
			String imgName = fileService.uploadFile(itemImgLocation, oriName, itemImgFile.getBytes());
			//이 프로젝트 안에서의 경로
			String imgUrl = "/images/item/" + imgName;
			
			itemImg.updateItemImg(oriName, imgName, imgUrl);
			
			
		}
	}
	
	
}
