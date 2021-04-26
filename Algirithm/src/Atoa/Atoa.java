package Atoa;
//대소문자 변환
//----------------------------------------------//
/*
 입력: HelloWorld
 출력: hELLOwORLD*/
//----------------------------------------------//
public class Atoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "HelloWorld";
		char [] array;
		array = input.toCharArray(); //문자열을 chararray로 변환
		System.out.println(array);
		
		//문자열을 배열에 넣은후 하나하나 변환
		for(int i=0; i<array.length;i++) {
			if(array[i]>='a' && array[i] <= 'z') {
				array[i] = (char)(array[i] + ('A'-'a'));  //소문자 a=65 처럼 아스키 코드를 몰라도된다. -> 'A'를 타입캐스팅하면 아스키 코드가 나오기 때문에
			}
			else if(array[i] >='A' && array[i]<='Z') {
				array[i] = (char)(array[i] - ('A'-'a'));				
			}
			System.out.print(array[i]);
		}
		System.out.println(" ");
		System.out.println("끝났습니다.");
	}

}
