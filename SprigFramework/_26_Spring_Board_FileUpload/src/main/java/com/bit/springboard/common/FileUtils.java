package com.bit.springboard.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.bit.springboard.dto.BoardFileDTO;

public class FileUtils {
	//MultipartFile 객체를 받아서 DTO형태로 변경 후 리턴
	public static BoardFileDTO parseFileInfo(MultipartFile file, String attachPath) {
		//리턴할 BoardDTO 객체 생성
		BoardFileDTO boardFileDTO = new BoardFileDTO();
		
		String boardFileOrigin = file.getOriginalFilename();
		
		//같은 파일명 파일이 올라오면 나중에 업로드 된 파일로 덮어써지기 때문에 
		//파일명을 날짜_랜덤_...
		SimpleDateFormat formmater = new SimpleDateFormat("yyyMMddHHmmss");
		Date nowDate = new Date();
		String nowDateStr = formmater.format(nowDate);
		
		UUID uuid = UUID.randomUUID();
		
		//실제 DB에 저장될 파일명
		String boardFileName = nowDateStr + "_" + uuid.toString() + "_" + boardFileOrigin;
		
		String boardFilePath = attachPath;
		
		//파일 업로드 처리
		File uploadFile = new File(attachPath + boardFileName);
		
		//리턴될 DTO 셋팅
		boardFileDTO.setBoardFileName(boardFileName);
		boardFileDTO.setBoardFileOrigin(boardFileOrigin);
		boardFileDTO.setBoardFilePath(boardFilePath);
		
		try {
			file.transferTo(uploadFile);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return boardFileDTO;
		
	}
	
}
