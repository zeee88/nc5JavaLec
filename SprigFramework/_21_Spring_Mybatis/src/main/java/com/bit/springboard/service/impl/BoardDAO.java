package com.bit.springboard.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit.springboard.dto.BoardDTO;

//DAO(Data Access Object): DB에 직접 접근하는 객체 
//					=> Boot에서는 Mapper 인터페이스나 Repository  인터페이스 사용 
//JDBC Template 사용방식2
//JDBC Template 필드로 선언 후 의존성 주입 받아서 사용
@Repository("boardDAO")
public class BoardDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	//쿼리등록
	private final String INSERT_BOARD = "INSERT INTO T_BOARD ("
			+ "             BOARD_NO, "
			+ "				BOARD_TITLE, "
			+ "				BOARD_CONTENT, "
			+ "				BOARD_WRITER"
			+ "			) VALUES ("
			+ "				?,"
			+ "				?,"
			+ "             ?,"
			+ "				?"
			+ "			)";
	
	private final String GET_BOARD = "SELECT "
			+ "		BOARD_NO"
			+ "	  , BOARD_TITLE"
			+ "	  , BOARD_CONTENT"
			+ "   , BOARD_WRITER"
			+ "   , BOARD_REGDATE"
			+ "   , BOARD_CNT"
			+ "  FROM T_BOARD"
			+ "  WHERE BOARD_NO = ?";
	
	private final String UPDATE_BOARD = "UPDATE T_BOARD SET"
			+ "		BOARD_TITLE = ?,"
			+ "		BOARD_CONTENT = ?"
			+ "	  WHERE BOARD_NO = ?";
	
	private final String DELETE_BOARD = "DELETE FROM T_BOARD WHERE BOARD_NO = ?";
	
	private final String GET_BOARDLIST = "SELECT * FROM T_BOARD";
	
	//글 등록
	public void insertBoard(BoardDTO boardDTO) {
		System.out.println("insertBoard 실행");
		
		mybatis.insert("BoardDAO.insertBoard", boardDTO);
	}
	
	//글 수정
	public void updateBoard(BoardDTO boardDTO) {
		System.out.println("updateBoard 실행");
		
		mybatis.update("BoardDAO.updateBoard", boardDTO);
	}
	
	//글 삭제
	public void deleteBoard(int boardNo) {
		System.out.println("deleteBoard 실행");
		
		mybatis.delete("BoardDAO.deleteBoard", boardNo);
	}
	
	//글 상세 조회
	public BoardDTO getBoard(int boardNo) {
		System.out.println("getBoard 실행");
		
		return mybatis.selectOne("BoardDAO.getBoard", boardNo);
	}
	
	//글 목록 조회
	public List<BoardDTO> getBoardList() {
		
		
		return mybatis.selectList("BoardDAO.getBoardList");
	}
	
	
	
	
	
	
}
