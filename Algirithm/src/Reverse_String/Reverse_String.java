package Reverse_String;
//문자열 뒤집기
//----------------------------------------------//
/*
 입력된 문자열을 뒤집어서 출력하라.
 입력: ABCD
 출력: DCBA*/
//----------------------------------------------//
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";
		char str[] = s.toCharArray(); //String을 배열로 변화
		char temp;
		
		System.out.println(s);
		
		
		int len = str.length;
		for(int i =0; i<len/2;i++) {
			temp=str[i];
			str[i]=str[len-1-i];
			str[len-1-i] = temp;
		}
		
		s = new String(str); //문자를 다시 String으로 변환
		System.out.println(s);
	}

}
