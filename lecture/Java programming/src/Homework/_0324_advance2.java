package Homework;

import java.util.Scanner;

public class _0324_advance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세용");
        StringBuilder strb = new StringBuilder(sc.next());

        for(int i = 0; i<strb.length()-1; i++){  //length()-1인 이유는 마지막 글자는 오른쪽에 비교할 글자가 없음. 이미 비교 완료.
            if(strb.charAt(i)==strb.charAt(i+1)){
                strb.deleteCharAt(i+1);
                i--;   //중복된 숫자 제거 후 다시 비교하려면 앞 숫자로 가야함.
                //delete하면 i+1자리 있던 것이 i자리로 감.
            }
        }
        System.out.println(strb);
    }
}
