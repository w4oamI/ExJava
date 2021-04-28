package Allsum;
//입력된 수의 각 자깃수 합을 구하여라.
//------------------------------------------------//
/*
 입력: 3131
 출력: 8*/
//------------------------------------------------//
public class Allsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11111;
		int sum = 0;
		
		while(num>0) {
			sum += num % 10;
			num/=10;
		}
		System.out.println(sum);
	}

}
