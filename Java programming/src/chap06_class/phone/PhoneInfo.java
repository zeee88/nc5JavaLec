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

	
	
	public PhoneInfo() {
		String[] names = {"홍길동", "장동건", "원빈"};
		String[] phoneNums = {"1111", "2222", "3333"};
		
		System.arraycopy(names, 0, name, 0, names.length);
		System.arraycopy(phoneNums, 0, phoneNum, 0, phoneNums.length);
		
		currentIndex = names.length;
	}
	
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
	
	
	public static void write(String Name, String Num) {
	
		
		Name += Name + "\n";
		Num += Num + "\n";
		
		
		write(Name, Num);
		System.out.println(Name);
		System.out.println(Num);
		
		
		try {
			OutputStream os = new FileOutputStream("C:/java/pho.txt", true);
							//true가 없으면 입력한 값 중 마지막 값만 저장됨. true를 붙여야 입력한 데이터 모두 저장됨
			Writer writer = new OutputStreamWriter(os, "UTF-8");
			
			writer.write(Name);	
			writer.write(Num);	
			
			writer.flush();
			writer.close();
			
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	
	
	
	
	
}
