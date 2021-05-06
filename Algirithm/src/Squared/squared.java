package Squared;
//거듭 제곱
//------------------------------------------------//
/*
예제)
입력: 2 3
출력: 8
*/

//------------------------------------------------//
public class squared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int squ = 4;
		
		int sum = 1;
		for(int i=0;i<squ;i++) {
			sum *=num;
		}
		System.out.println(sum);
	}

}
