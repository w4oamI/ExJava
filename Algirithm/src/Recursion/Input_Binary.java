package Recursion;
import java.util.*;
//입력된 수를 2진수로 변환한다.
//-----------------------------------------//
/*
 조건: 재귀를 이용한다.
 입력: 17
 출력: 1 0001*/
//-----------------------------------------//
public class Input_Binary {
	public static void Binary(int input) {
		if(input/2 == 0) {
			System.out.print(input);
			return ;
		}
		Binary(input/2);
		System.out.print(input%2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		Binary(input);
	}

}
