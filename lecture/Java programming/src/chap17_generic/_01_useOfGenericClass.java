package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자유게시판 게시글에 대한 첨부파일 생성
//		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
		
//		//방법 1
//		FreeBoard fBoard = new FreeBoard();		//FreeBoard 객체 생성
//		
//		fBoard.setfBoardNo(1);
//		fBoard.setfBoardTitle("test");
//		fBoard.setfBoardContent("test입니다.");
//		
//		fBoardFile.setT(fBoard);		//T에 fBoard를 넣어주겠다.
//		
//		
//		//방법 2
//		fBoardFile.setT(new FreeBoard());
//		fBoardFile.getT().setfBoardNo(1);
//		fBoardFile.getT().setfBoardTitle("test");
//		fBoardFile.getT().setfBoardContent("test입니다.");
//		
		
		         //setBoardNo()호출,  
//		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo());
//		fBoardFile.setType(fBoardFile.getT()
//									 .getClass()
//									 .getSimpleName()
//									 .equals("FreeBoard")
//									 ? 1 : 2
//							);
//		
//		fBoardFile.setBoardFileNm("첨부파일");
//		
//		System.out.println(fBoardFile);
		
		
		//공지사항 게시글에 대한 첨부파일 생성
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		
		nBoardFile.setT(new NoticeBoard());
		
		nBoardFile.getT().setnBoardNo(2);
		nBoardFile.getT().setnBoardTitle("테스트");
		nBoardFile.getT().setnBoardContent("테스트입니다.");
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo());
		nBoardFile.setType(nBoardFile.getT()
									 .getClass()
									 .getSimpleName()
									 .equals("NoticeBoard")
									 ? 1 : 2
							  );
		
		System.out.println(nBoardFile);
		
		
			
			
			
	}

}
