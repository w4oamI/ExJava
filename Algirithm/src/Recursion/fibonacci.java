package Recursion;
import java.util.*;
//입력된 항의 피보나치 수를 구한다.
//------------------------------------------//
/*
 조건: 재귀를 이용한다.
 입력: 6
 출력: 8*/
//------------------------------------------//
public class fibonacci {
	public static int fibo(int sc) {
		if(sc == 1)
			return 1;
		if(sc == 2)
			return 1;
		return fibo(sc-1)+fibo(sc-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int resul = fibo(num);
		
		System.out.println(resul);
		
	}

}
