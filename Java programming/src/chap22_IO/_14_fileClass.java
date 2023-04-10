package chap22_IO;

import java.io.File;
import java.io.IOException;

public class _14_fileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 파일객체 생성
		File newDirectory = new File("C:/java/Test");
		
		File newFile = new File("C:/java/fileEx01.txt");
		
		//2. 파일, 폴더 생성
		try {
		if(!newDirectory.exists()) {
			newDirectory.mkdir();
		}
		
		if(!newFile.exists()) {
			
				newFile.createNewFile();
			}
		
		//3. 파일 객체 생성
		File directory = new File("C:/java");
		File deleteFile = new File("C:/java/name.txt");
		File[] fileArr = directory.listFiles();
		
		for(File f : fileArr) {
			System.out.println(f.getName());
		}
		
		System.out.println("---------------");
		boolean isDeleted = deleteFile.delete();
		
		if(isDeleted) {
			System.out.println("파일이 정상적으로 삭제되었습니다.");
		}else {
			System.out.println();
		}
		
		
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
