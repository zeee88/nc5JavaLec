package chap06_class.phone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PhoneInfo {
	//이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	

	//배열의 현재 인덱스를 담고 있을 변수
	int currentIndex = 0;  

	
	//전달받은 이름과 전화번호를 저장하는 메소드
	//insertPhoneNum
	public void insertPhoneNum(String name, String PhoneNum) {
		this.name[currentIndex] = name;
		this.phoneNum[currentIndex] = PhoneNum;
		currentIndex++;
		
	}
	
	
	//저장된 모든 이름과 전화번호를 출력하는 메소드
	//printAllPhoneNum
	//ex) 이름 : 홍길동1, 전화번호 : 11111111111
	//    이름 : 홍길동2, 전화번호 : 22222222222
	//    이름 : 홍길동3, 전화번호 : 33333333333
	//    이름 : 홍길동4, 전화번호 : 44444444444
	public void printAllPhoneNum() {
		for(int i = 0; i < currentIndex; i++) {
			System.out.println("이름 : " + name[i] +
					", 전화번호 : " + phoneNum[i]);
		}
	}
	
	//전달받은 인덱스의 해당하는 이름과 전화번호를 출력하는 메소드
	//printPhoneNum
	//ex) 이름 : 홍길동3, 전화번호 : 33333333333
	public void printPhoneNum(int index) {
		if(name[index - 1] == null) {
			System.out.println("해당 인덱스의 정보가 존재하지 않습니다.");
		} else {
			System.out.println("이름 : " + name[index - 1] +
					", 전화번호 : " + phoneNum[index - 1]);
		}
	}
	
	
	public void write() {
	
		try {
			OutputStream os1 = new FileOutputStream("C:/java/name.txt", true);    //append와 비슷
			OutputStream os2 = new FileOutputStream("C:/java/phoneNum.txt", true);
							//true가 없으면 입력한 값 중 마지막 값만 저장됨. true를 붙여야 입력한 데이터 모두 저장됨
			Writer writer1 = new OutputStreamWriter(os1, "UTF-8");
			Writer writer2 = new OutputStreamWriter(os2, "UTF-8");
			
			for(int i = 0; i < currentIndex; i++) {
			
//			String str = "이름: " + this.name[i] + "\n";
//			String str1 = "번호: " + this.phoneNum[i] + "\n";
			
				//String으로 받지 않고 바로 write에 사용 가능.
			writer1.write("이름: " + this.name[i] + "\n");		 //PhoneInfo에서 String배열로 받았으므로 배열 형태로
			writer2.write("번호: " + this.phoneNum[i] + "\n");	 //static이 붙으면 this를 쓸 수 없음
			}
			
			writer1.flush();
			writer1.close();

			writer2.flush();
			writer2.close();
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	
	
	//read 메소드도 사용하기
	
	
	
	
}
