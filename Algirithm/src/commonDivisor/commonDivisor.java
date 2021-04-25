package commonDivisor;
//최대 공약수 구하기
//---------------------------------------------------//
/*
 입력된 두 수의 최대공약수를 구하라.
 예)
 입력: 12 18
 출력: 6
 */
//---------------------------------------------------//
public class commonDivisor {
	public static void main(String[] args) {
		int num1,num2;
		num1 = 18;
		num2 = 12;
		
		int big;
		int small;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small =num1;
		}
		
		//모든 최대 공약수는 1부터 시작한다.
		int cd = 1; //cd는 최대공약수 약자
		
		//최대 공약수는 최소값이 나눠질때 까지 구하기 때문에 i<=small이 된다.
		for(int i=1; i<=small;i++) {
			if(big % i == 0 && small % i ==0) { //나머지가 0이라는 것은 나누어 떨어진다.
				cd = i;
			}
		}
		System.out.println("최대 공약수는: "+cd+"입니다.");
	}
	
}
