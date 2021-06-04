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
//		Binary(17)을 받게되면 Binary(input/2);로 인해서 
//		8,4,2,1 순서대로 재귀로 들어가게 되고, 1이 되었을때 위의
//		if문을 만나 출력을 한후, 1 이전 숫자였던 2를 input으로
//		(input%2); 을 실행하고, 그다음 4를 input으로 (input%2)를
//		실행하고, 그후 8을 input으로 (input%2)을 실행한다.
		System.out.print(input%2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		Binary(input);
	}

}
