package project1.spring.item.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import project1.spring.item.dto.ItemFormDto;
import project1.spring.item.dto.ItemSearchDto;
import project1.spring.item.entity.Item;
import project1.spring.item.service.ItemService;

@Controller
@RequiredArgsConstructor		//@Autowired와 비슷한 기능. ItemService를 객체화하여 사용하기 위해.(ItemService에 final을 붙여야 한다.)
public class ItemController {

	private final ItemService itemService;
	
	@GetMapping("/admin/item/new")
	public String itemForm(Model model) {
		//현재 아무값도 없기 때문에 빈 객체라도 들고 가야 함.
		//빈 dto를 날리는 것. itemFormDto를 model 객체에 담아서 뷰로 전달.
		model.addAttribute("itemFormDto", new ItemFormDto());
		return "item/itemForm";
	}
	
	//상품 등록
	@PostMapping("admin/item/new")
	public String itemNew(@Valid ItemFormDto itemFormDto, BindingResult bindingResult, 
			Model model, @RequestParam("itemImgFile")List<MultipartFile> itemImgFileList) {
	
		//진행 중 에러가 있으면 진행하지 않고 item/itemForm으로 이동
		if(bindingResult.hasErrors()) {
			return "item/itemForm";
		}
		
		if(itemImgFileList.get(0).isEmpty() && itemFormDto.getId() == null) {
			model.addAttribute("errorMessage", "첫 번째 상품 이미지는 필수입니다.");
			return "item/itemForm";
		}
		
		try {
			itemService.saveItem(itemFormDto, itemImgFileList);
		} catch (IOException e) {
			model.addAttribute("errorMessage", "상품 등록 중 오류 발생.");
			return "item/itemForm";
		}
		
		return"redirect:/";
	}
	
	
	//상품 상세정보 조회((상품 등록 폼에서)
	@GetMapping("/admin/item/{itemId}")
	//path(경로) 상에 있는 variable 설정
	public String itemDetail(@PathVariable("itemId") Long itemId, Model model) {
		
		try {
			//itemService에 있는 getItemDetail 메소드
			ItemFormDto itemFormDto = itemService.getItemDetail(itemId);
			model.addAttribute("itemFormDto", itemFormDto);
		} catch (EntityNotFoundException e) {
			model.addAttribute("errorMessage", "존재하지 않는 상품입니다.");
			//오류난 후 itemForm으로 다시 돌아가기 위함.
			//현재 아무값도 없기 때문에 빈 객체라도 들고 가야 함.
			//빈 dto를 날리는 것. itemFormDto를 model 객체에 담아서 뷰로 전달.
			model.addAttribute("itemFormDto", new ItemFormDto());
			return "item/itemForm";
		}
		
		return "item/itemForm";
	}
	
	//상품 정보 수정 
	@PostMapping("/admin/item/{itemId}")
	public String itemUpdate(@Valid ItemFormDto itemFormDto, BindingResult bindingResult, 
			Model model, @RequestParam("itemImgFile")List<MultipartFile> itemImgFileList) {
		
		//진행 중 에러가 있으면 진행하지 않고 item/itemForm으로 이동
		if(bindingResult.hasErrors()) {
			return "item/itemForm";
		}
		
		//상품은 이미지 없이 텍스트만 있어서는 안된다. 첫 번째 상품 이미지 필수 입력.
		if(itemImgFileList.get(0).isEmpty() && itemFormDto.getId() == null) {
			model.addAttribute("errorMessage", "첫 번째 상품 이미지는 필수입니다.");
			return "item/itemForm";
		}
		
		//itemService에 있는 updateItem 메소드 실행.
		//진행 중 오류 발생 시 item/itemForm으로 되돌아감.
		try {
			itemService.updateItem(itemFormDto, itemImgFileList);
		} catch (IOException e) {
			model.addAttribute("errorMessage", "상품 수정 중에 오류가 발생했습니다.");
			return "item/itemForm";
		}
		
		//정상적으로 처리 완료되면 루트로 되돌리기
		return "redirect:/";
	}
	
	//상품관리 탭에서 상품목록 가져오기
	@GetMapping({"/admin/items", "/admin/items/{page}"})	//페이지 정보 없는 것, 있는 것 둘 다 처리 가능.
	public String itemList(ItemSearchDto itemSearchDto, Model model,
			//페이지 정보를 들고 올 수도 있고 페이지 정보가 없을 수도 있다.
			@PathVariable("page") Optional<Integer> page) {
		//시작페이지는 페이지가 있으면 get()한 페이지 들고 오고 아니면 0으로 하겠다. 한 페이지에 상품은 3개씩 
		Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 3);
		Page<Item> items = itemService.getAdminItemPage(itemSearchDto, pageable);
		
		model.addAttribute("items", items);
		model.addAttribute("itemSearchDto", itemSearchDto);
		model.addAttribute("maxPage", 5);
		
		return "item/itemList";
	}
	
}
