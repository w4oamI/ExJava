package Factorial;
//팩토리얼 구하기
//------------------------------------------------//
/*
 입력된 수의 팩토리얼을 구하시오.
 입력: 5
 출력: 120*/
//------------------------------------------------//
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int total = 1;
		
		//첫번쩨 방법(증감연산자 사용)
		for(int i=1;i<=num;i++) {
			total *= i;
		}
		System.out.println(total);
		
		total = 1;
		for(int i=num;i>=1;i--) {
			total *= i;
		}
		System.out.println(total);
	}

}
