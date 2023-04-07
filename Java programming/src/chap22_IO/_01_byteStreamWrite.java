package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class _01_byteStreamWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream os = new FileOutputStream("C:/java/ex02.txt");
			
//			OutputStreamWriter osw = new OutputStreamWriter(os, Charset.forName("UTF-8"));

			// 1. byte를 1byte씩 출력
			byte num1 = -128;
			byte num2 = 127;
			byte num3 = 0;

			os.write(num1);
			os.write(num2);
			os.write(num3);

			//1-1. 바이트 배열로 출력
			byte[] byteArr = new byte[5];
			
			for(int i = 0; i < 5; i++) {
				byteArr[i] = (byte)(i * 5);
			}
			
			//index == 1부터 3개를 출력
			os.write(byteArr, 1, 3);
			
			// 2. 버퍼 비워주기(버퍼에 남아있는 바이트 모두 출력)
			os.flush();

			// 3. 스트림 메모리에서 해제
			os.close();

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
}
