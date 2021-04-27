package Factorial;
import java.util.*;
//팩토리얼 구하기(재귀함수 사용)
//------------------------------------------------//
/*
조건: 재귀함수 사용.
     사용자에게 숫자를 입력받아서 결과 출력
입력된 수의 팩토리얼을 구하시오.
입력: 5
출력: 120*/
//------------------------------------------------//


public class Factorial_Recursion {

	//재귀함수에서 가장 중요한것은 "탈출 조건"을 명시해야한다.
	public static int fac(int i) {
		if(i==1) {
			return 1;
		}
		return i*fac(i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //입력
		int total = 0; //결과
		
		total=fac(num);
		System.out.println(total);
	}
	
	

}
